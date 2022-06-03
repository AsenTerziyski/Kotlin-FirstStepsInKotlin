package com.google.kotlin.commons

fun main(args: Array<String>) {
    var a = B()
    DemoSingleton2.printVarName()
    DemoSingleton2.printVarName()
    println(B())
    println(B())
    println(DemoSingleton2.hashCode())
    println(DemoSingleton2.hashCode())

}

open class B {
    open fun printVarName() {
        println("I am in class printVarName")
        DemoSingleton2.printVarName()
    }

    init {
        println("I am in init of A")
    }
}

object DemoSingleton2: B() {
    init {
        println("Singleton class invoked.")
    }

    var variableName = "I am Var"
    override fun printVarName() {
        println(variableName)
    }
}