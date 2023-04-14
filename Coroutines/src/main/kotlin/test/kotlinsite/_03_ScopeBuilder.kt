package test.kotlinsite

import kotlinx.coroutines.*

fun main() = runBlocking {
    doWorldGreet()
}

suspend fun doWorldGreet() = coroutineScope {  // this: CoroutineScope
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello")
}