package test

import kotlinx.coroutines.*
import java.util.concurrent.Executor
import java.util.concurrent.Executors

val scope = CoroutineScope(Job())
val dispatcher = Executors.newCachedThreadPool().asCoroutineDispatcher()
val executor = Executors.newFixedThreadPool(10)

fun main() = runBlocking {
    val jobs = arrayListOf<Job>()

    jobs += launch {
        println(Thread.currentThread().name)
    }

    jobs += launch(Dispatchers.Default) {
        println(Thread.currentThread().name)
    }

    jobs += launch(Dispatchers.IO) {
        println(Thread.currentThread().name)
    }

    jobs += launch(Dispatchers.Unconfined) {
        println(Thread.currentThread().name)
    }

    jobs += launch(newSingleThreadContext("My thread")) {
        println(Thread.currentThread().name)
    }

    jobs += launch(dispatcher) {
        println(Thread.currentThread().name)
    }

    jobs += launch(executor.asCoroutineDispatcher()) {
        println(Thread.currentThread().name)
    }



    jobs.forEach {
        it.join()
    }

    dispatcher.close()
    executor.shutdown()
}