package test

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = launch {
        delay(1000)
        print("World")
    }

    val job2 = launch {
        delay(2500)
        println("!!!")
    }

    print("Hello, ")

    job.join()
    job2.join()

    delay(3500)

    println("DONE!")
}