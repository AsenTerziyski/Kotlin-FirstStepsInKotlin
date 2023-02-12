package test

import javafx.application.Application.launch
import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicInteger
import kotlin.concurrent.thread

const val num_tasks = 10_000
const val loops = 500
const val waits_ms = 10L

fun main() = runBlocking {
    println("Starting")
    val result = AtomicInteger()
    val jobs = mutableListOf<Job>()

    for (i in 1..num_tasks ) {
        jobs.add(
            launch(Dispatchers.IO) {
                for (x in 1..loops) {
                    delay(waits_ms)
                }
            }
        )
    }

    jobs.forEach{it.join()}
    println(result.get())
}


fun old_main() {
    println("Starting")
    val result = AtomicInteger()
    val threads = mutableListOf<Thread>()

    for (i in 1..num_tasks ) {
        threads.add(
            thread {
                for (x in 1..loops) {
                    Thread.sleep(waits_ms)
                }
                result.getAndIncrement()
            }
        )
    }

    threads.forEach{it.join()}
    println(result.get())
}