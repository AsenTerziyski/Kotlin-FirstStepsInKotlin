package com.google.kotlin.softuni.oop.`05Polymorphysm`.demoCasio

class Casio {

    //Object expressions are executed
    // (and initialized) immediately,
    // where they are used.
    // Object declarations are initialized lazily,
    // when accessed for the first time.
    // A companion object is initialized when the corresponding class is loaded
    // (resolved) that matches the semantics of a Java static initializer.

    companion object {
        lateinit var instance: Casio

        fun add(a:Int, b:Int): Int {
            return a+b
        }

        fun subtract(a:Int, b:Int): Int {
            return a-b
        }
    }

    init {
        instance = this
    }
}