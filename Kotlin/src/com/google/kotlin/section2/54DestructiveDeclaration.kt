package com.google.kotlin.section2

fun main(args: Array<String>) {
    val pair = Pair("test1", 100)
    val pairTwo = "test2" to 200

    println(pair.first)
    println(pair.second)

    println(pair.first + pair.second)
    println(pairTwo.first + pairTwo.second)

    val (f, s) = pair
    println(f)
    println(s)

    println(f + s)

    mapOf(Pair("x", "y"), Pair("a", "b"), Pair("c", "d")).forEach { (f, s) -> println("$f goes with $s") }
    println()
    mapOf("A" to "Z", "L" to "M").forEach { (f, s) -> println("$f goes with $s") }

    val (d,e,w) = Destructive(7,8,9)
    println("$d - $e - $w")

    val(testContainer) = Container(700)
    println(testContainer)

    val (myTestContainer) = MyTestContainer("TEST")
    println(myTestContainer)


}

data class Destructive(val a:Any, val b:Any, val c:Any)

class MyContainer(val a:Any) {
    operator fun component1() = a
}

class MyTestContainer(val a: Any)
operator fun MyTestContainer.component1() = this.a
