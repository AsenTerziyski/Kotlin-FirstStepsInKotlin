import jdk.internal.org.jline.utils.Log

var global = 0

fun returnGlobal() = global
fun testOne(x: Int) = global++ + 1
fun testTwo() = global * 2

returnGlobal()
testOne(1)
returnGlobal()
testOne(1)
returnGlobal()
testTwo()
returnGlobal()