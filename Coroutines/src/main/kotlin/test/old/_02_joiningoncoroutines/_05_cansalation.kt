package test.old._02_joiningoncoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = launch {
        repeat(1000) {
            delay(10)
            print(".")
        }
    }

    delay(500)
    job.cancel()
    job.join()
    print("Done")
}