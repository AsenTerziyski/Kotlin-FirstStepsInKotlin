package test

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        delay(1000)
        print("World")
    }

    print("Hello, ")

    launch {
        delay(1500)
        println("!")
    }
    delay(2000)
}

suspend fun doWork(): String {
    delay(1000)
    return "Test"
}