package section3

import java.lang.Thread.sleep

object SharedValue {
    var list = ArrayList<String>()
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

fun main() {
    val thread1 = StandardThreadOne().apply {
        name = "T1"
        sleep(1000)
        start ()
    }

    val thread2 = StandardThreadTwo().apply {
        name = "T2"

        start()
    }

//    println(thread1.sharedValue.list)
//    println(thread2.sharedValue.list)

    println(SharedValue.list)

}
