package test

import kotlinx.coroutines.*

fun main() = runBlocking {

    val job = withTimeoutOrNull(100) {
        repeat(1000) {
            yield()
            print(".x ")
            Thread.sleep(10)
        }
    }

    if (job == null) {
        println("Builder timed-out!")
    }
//    try {
//        val job = withTimeout(100) {
//            repeat(1000) {
//                yield()
//                print(".x ")
//                Thread.sleep(1)
//            }
//        }
//    } catch (ex: TimeoutCancellationException) {
//        println()
//        println("Handled exception => $ex")
//    }
}