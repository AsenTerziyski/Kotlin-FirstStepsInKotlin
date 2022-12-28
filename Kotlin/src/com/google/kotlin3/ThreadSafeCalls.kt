package com.google.kotlin3

import java.util.*
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.schedule
import kotlin.concurrent.withLock

fun main() {
    val data = SharedObject()
    val aLock = ReentrantLock()
    // with lock runs threads synchronously
    BasicThreadOne(data, lock = aLock).apply {
        name = "ThreadOne"
        start()
    }

    BasicThreadTwo(data, lock = aLock).apply {
        name = "ThreadTwo"
        start()
    }
    Timer().schedule(1000) {
        println(data.sharedData)
    }
}

class SharedObject(var sharedData: String = "")

class BasicThreadOne(var shared: SharedObject, private val lock: Lock) : Thread() {
    override fun run() {
        super.run()
        lock.withLock {
            shared.sharedData = Thread.currentThread().toString()
            Thread.sleep(2000)
        }
//        shared.sharedData = Thread.currentThread().toString()
//        Thread.sleep(2000)
    }
}

class BasicThreadTwo(var shared: SharedObject, private val lock: Lock) : Thread() {
    override fun run() {
        super.run()
        lock.withLock {
            shared.sharedData = Thread.currentThread().toString()
        }
//        shared.sharedData = Thread.currentThread().toString()
    }
}