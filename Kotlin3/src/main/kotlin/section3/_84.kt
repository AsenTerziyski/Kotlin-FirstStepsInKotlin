package section3

import java.util.*
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.schedule
import kotlin.concurrent.withLock


fun main() {
    val data = SharedObject()
    val lock = ReentrantLock()
    BasicThreadOne(data, lock).apply {
        name = "ThreadOne"
        start()
    }
    BasicThreadSecond(data, lock).apply {
        name = "ThreadTwo"
        start()
    }

    Timer().schedule(1000) {
        println(data.sharedData)
    }

}

class SharedObject(var sharedData: String = "")

class BasicThreadOne(val shared: SharedObject, private val lock: Lock) : Thread() {
    override fun run() {
        super.run()
//        synchronized(shared) {
//            shared.sharedData = currentThread().toString()
//            sleep(2000)
//        }
        lock.withLock {
            shared.sharedData = currentThread().toString()
            sleep(2000)
        }
    }
}

class BasicThreadSecond(val shared: SharedObject, private val lock: Lock) : Thread() {
    override fun run() {
        super.run()
//        synchronized(shared) {
//        shared.sharedData = currentThread().toString()
//        }
        lock.withLock {
            shared.sharedData = currentThread().toString()
        }
    }
}