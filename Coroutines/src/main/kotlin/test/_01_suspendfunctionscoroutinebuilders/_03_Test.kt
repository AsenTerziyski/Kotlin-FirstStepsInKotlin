package test._01_suspendfunctionscoroutinebuilders

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("5")
    runBlocking {
        launch {
        testWork()
        testWork2()
        }
        println("4")
        testWork3()
    }

    println("3")
}

suspend fun testWork() {
    delay(4000)
    println("1")
}

suspend fun testWork2() {
    delay(3000)
    println("2")
}

suspend fun testWork3() {
    delay(1000)
    println(6)
}