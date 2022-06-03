package com.google.kotlin.section1.section1Pregovor

fun main() {
    Xerox().copy("A4")
    Xerox().scan("A3")
}

interface Copier {
    fun copy(a:String)
}

interface Scanerr {
    fun scan(a:String)
}

class Xerox : Copier,Scanerr{
    override fun copy(a:String) {
        println("Copied $a")
    }

    override fun scan(a: String) {
        println("Scanned $a")
    }

}