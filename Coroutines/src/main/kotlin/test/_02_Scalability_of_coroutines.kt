package test

import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicInteger
import kotlin.concurrent.thread

fun main() = runBlocking {

    println("Starting")

    val result = AtomicInteger()
    val jobs = mutableListOf<Job>()

    for (i in 1..num_tasks) {
        jobs.add(
            launch(Dispatchers.IO) {
                for (i in 1..loops) {
                    delay(wait_ms)
                }
                result.getAndIncrement()
            }
        )
    }

    jobs.forEach { it.join() }
    println(result.get())
}

fun oldMain1() {
    println("Starting")
    val result = AtomicInteger()
    val threads = mutableListOf<Thread>()

    for (i in 1..num_tasks) {
        threads.add(thread {
            for (x in 1..loops) {
                Thread.sleep(wait_ms)
            }
            result.getAndIncrement()
        })

    }

    threads.forEach { it.join() }
    println(result.get())

}

const val num_tasks = 10_000
const val loops = 500
const val wait_ms = 10L