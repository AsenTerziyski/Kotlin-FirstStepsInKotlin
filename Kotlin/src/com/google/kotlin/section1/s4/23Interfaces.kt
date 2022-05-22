package com.google.kotlin.section1.s4

fun main() {
    var tv = Television("Sony", "Vayo")
    tv.powerOn()
    tv.powerOff()
    tv.about()
}

interface Remote {
    var model: String
    var test: String

    fun powerOn()
    fun powerOff()
    fun about() {
        println("I am a remote!")
    }
}

class Television constructor(private var brand: String, override var model: String) : Remote {
//    private var model: String = ""

    override var test: String = ""

    init {
        this.test = "TEST"
    }

    // overriding is mandatory
    override fun powerOn() {
        println("${this.brand}: ${this.model} On...!")
    }

    // overriding is mandatory
    override fun powerOff() {
        println("${this.brand}: ${this.test}..Off!")
    }

    // overriding is not mandatory
//    override fun about() {
//        super.about()
//        println("I am a tv set!!! Not remote")
//    }
}