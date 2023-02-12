package section3

fun main() {
    thread(aName = "FirstThread", aPriority = 10)
    thread(true, "SecondThread", 10)
}

fun thread(
    aStart: Boolean = true,
    aName: String? = null,
    aPriority: Int = -1
): Thread {

    val aThread = object : Thread() {
        override fun run() {
            super.run()
            println(Thread.currentThread())
        }
    }

    if (aPriority > 0) {
        aThread.priority = aPriority
        println(aThread)
    }

    aName?.let {
        aThread.name = aName
        println(aName)
    }

    if (aStart) {
        aThread.start()
        println(aStart)
    }

    return aThread
}