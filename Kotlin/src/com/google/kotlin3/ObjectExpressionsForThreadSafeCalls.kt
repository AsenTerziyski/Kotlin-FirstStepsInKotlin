package com.google.kotlin3

fun main() {
    thread(true, name = "MyThread", priority = 10)
}

fun thread(
    start: Boolean,
    name: String? = null,
    priority: Int = -1

): Thread {

    val thread = object : Thread() {
        override fun run() {
            super.run()
            println(Thread.currentThread())
        }
    }

    name?.let {
        thread.name = name
    }

    if (priority > 0) {
        thread.priority = priority
    }

    if (start) thread.start()

    return thread
}