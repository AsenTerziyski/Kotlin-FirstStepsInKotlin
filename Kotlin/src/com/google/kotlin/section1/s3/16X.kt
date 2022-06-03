package com.google.kotlin.section1.s3

import com.google.kotlin.section2.b

fun main() {
    println(addWithDefaultParam(2))
    println(addWithDefaultParam(2, 3))

    println(attachStrings(null,true))
    println(attachStrings("Eho", 10, "Hello"))
}

fun addWithDefaultParam(number: Int, base: Int = 10): Int {
    return number + base
}

fun attachStrings(firstStr: String?,thirdParam: Any, secondString: String = "-" ): String {
    return StringBuilder()
        .append(firstStr)
        .append(" + ")
        .append(secondString)
        .append(" -> ")
        .append(System.lineSeparator())
        .append("thirdParam:")
        .append(thirdParam)
        .append("! ").toString().trim()
}