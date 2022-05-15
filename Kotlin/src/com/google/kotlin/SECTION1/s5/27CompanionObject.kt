package com.google.kotlin.SECTION1.s5

fun main(args: Array<String>) {
    println("Start program....")
    val pi = School.pi
    println(School.findRectangleArea(10, 10))
    println(pi)

    println("......End program")
}


class School {
    companion object {
        val pi = 3.14
        fun findRectangleArea(a: Int, b: Int): Int {
            return a * b
        }
    }

}