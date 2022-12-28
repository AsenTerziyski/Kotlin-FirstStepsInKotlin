package com.google.kotlin3

fun main() {
    val standardThreadThree = StandardThreadThree(100, "WelcomeThread").apply {
        start()
    }
}

class StandardThreadThree(val timeOut: Int, aName: String) : Thread(aName) {
    override fun run() {
        super.run()
        println(Thread.currentThread().toString() + "Time out: $timeOut - $name")
    }
}