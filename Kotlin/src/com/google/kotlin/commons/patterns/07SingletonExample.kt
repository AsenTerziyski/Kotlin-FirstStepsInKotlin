package com.google.kotlin.commons


//https://blog.mindorks.com/how-to-create-a-singleton-class-in-kotlin
fun main(args: Array<String>) {
    DemoSingleton.printVarName()
    DemoSingleton.variableName = "New name"
    var a = A()
    println(DemoSingleton)
    a = A()

}

object DemoSingleton {
    init {
        println("Singleton class invoked.")
    }
    var variableName = "I am a Var!"
    fun printVarName() {
        println(variableName)
    }

}

class A {
    init {
        println("Class init method. Singleton variableName property : ${DemoSingleton.variableName}")

        DemoSingleton.printVarName()
        println(DemoSingleton)
    }
}