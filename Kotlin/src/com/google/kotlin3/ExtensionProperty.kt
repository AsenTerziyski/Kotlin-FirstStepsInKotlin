package com.google.kotlin3

fun main() {
    val tel = "+359000000000"
    println(tel.getCountryCode)

    val tel2 = StringBuilder("+359000000000")
    tel2.strBuilderCoutryCode = "XXXX"
    println(tel2)
}

val String.getCountryCode: String
    get() = this.substring(0, 4)

var StringBuilder.strBuilderCoutryCode: String
    get() = this.substring(0, 4)
    set(value) {
        this.replace(0, 4, value)
    }