package test.kotlinsite

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun doWorld3() = coroutineScope {
    launch {
        delay(2000)
        print(" World 2")
    }

    launch {
        delay(1000)
        print(" World 1")
    }

    print("Hello")
}

fun main() = runBlocking {
    doWorld3()
    delay(1000)
    println(" ...Done")
}