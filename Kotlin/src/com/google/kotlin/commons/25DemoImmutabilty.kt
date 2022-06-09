package com.google.kotlin.commons

fun main(args: Array<String>) {
    val myTest = MyTest("Jon", 33)
    val copyMyTest = myTest.copy(name = "Maria")
    println(myTest)
    println(copyMyTest)
    val copyCopyMyTest = copyMyTest.copy(age = 100)
    println(copyCopyMyTest)

}

data class MyTest(val name:String, val age:Int)