package test.old._01_suspendfunctionscoroutinebuilders

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    doFirstWorking()
    launch {
        delay(1000)
        println("World")
    }

    print("Hello, ")

    doWorking()
    doFirstWorking()


}

suspend fun doWorking() {
    delay(3000)
    println("Kotlin:)")
}

suspend fun doFirstWorking() {
    delay(500)
    println("!!!!!!!!!!!!!!")
}