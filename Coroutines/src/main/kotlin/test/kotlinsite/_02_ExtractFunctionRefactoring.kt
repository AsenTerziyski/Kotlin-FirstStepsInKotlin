package test.kotlinsite

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        doWorld()
        doExclMarc()
    }
    print("Hello, ")

}

suspend fun doWorld() {
    delay(1000)
    print("World")
}

suspend fun doExclMarc() {
    delay(2000)
    println("!")
}