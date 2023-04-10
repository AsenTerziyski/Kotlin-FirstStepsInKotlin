package test.old._00_intro


import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
//    thread {
//        Thread.sleep(1000)
//        println("World")
//    }
//
//    println("Hello")
//    Thread.sleep(1500)

    GlobalScope.launch {
        delay(1000)
        print("World")
    }

    GlobalScope.launch {
        delay(1300)
        print("!")
        println()
    }

    GlobalScope.launch {
        delay(1400)
        println("XXXXXXXXXXXXXXXXXXXXXXXXXX")
    }


    print("Hello, ")
    Thread.sleep(1500)
}