package com.google.kotlin.SECTION1.s3

fun main(args: Array<String>) {
    printRectangleDimensions(10,20)
    // can change the sequence of the parameters:
    printRectangleDimensions(width = 20, height = 10)
}

fun printRectangleDimensions(height: Int, width: Int) {
    println("The height is $height")
    println("The width is $width")
}
