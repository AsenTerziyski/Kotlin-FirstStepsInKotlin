package com.google.kotlin3

fun main() {
    val thread1 = StandardThreadOne().apply {
        name = "FirstThread"
        start()
    }

    val thread2 = StandardThreadTwo().apply {
        name = "SecondThread"
        start()
    }

    println(SharedValue.list)
}

object SharedValue {
    val list = ArrayList<String>()
}

class StandardThreadOne : Thread() {
    //    val sharedValue = SharedValue()
    override fun run() {
        super.run()
        SharedValue.list.add(Thread.currentThread().toString())
    }
}


class StandardThreadTwo : Thread() {
    //    val sharedValue = SharedValue()
    override fun run() {
        super.run()
        SharedValue.list.add(Thread.currentThread().toString())
    }
}