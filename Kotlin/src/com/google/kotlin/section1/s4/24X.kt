package com.google.kotlin.section1.s4

fun main(args: Array<String>) {
    val p1 = MyDataClass("Peter", 10)
//    val p2 = MyDataClass("John", 15)
    val p2 = MyDataClass("Peter", 10)
    println(p1.hashCode())
    println(p2.hashCode())
    println(p1.toString())
    println(p2.toString())

    if (p1 == p2) {
        println("%s = %s".format(p1.name, p2.name))
    }

}

data class MyDataClass(val name: String, val age: Int) {

}