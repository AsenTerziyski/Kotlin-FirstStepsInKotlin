package test

import kotlinx.coroutines.*

fun main() = runBlocking {
    var child1: Job? = null

    coroutineScope {
        val job = GlobalScope.launch {
            child1 = launch {
                repeat(1000) {
                    Thread.sleep(1000)
                    print("1")
                    yield()
                }

            }

            repeat(1000) {
                delay(1000)
                print("0")
            }
        }
        delay(4000)
        job.cancelAndJoin()
        child1?.cancelAndJoin()

        println()
        println("Job is cancelled ${job.isCancelled}")
        println("Job is active ${job.isActive}")
        job.join()
    }
    println("coroutine scope finished")
}