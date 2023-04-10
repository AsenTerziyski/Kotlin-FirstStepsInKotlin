package test

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.Thread.sleep
import kotlin.concurrent.thread

fun main() {
    GlobalScope.launch {
        delay(1000)
        print("World")
    }

    GlobalScope.launch {
        delay(1500)
        print(".......")
    }

    GlobalScope.launch {
        delay(1800)
        println()
        println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
    }

    GlobalScope.launch {
        delay(1750)
        println("!")
    }

    print("Hello, ")
    Thread.sleep(3000)
    println("End of program.")
}

fun oldMain() {
    thread {
        sleep(1000)
        println("World!")
    }
    print("Hello, ")
    Thread.sleep(1500)
}