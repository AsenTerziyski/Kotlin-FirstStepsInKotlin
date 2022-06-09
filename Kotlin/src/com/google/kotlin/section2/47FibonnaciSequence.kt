package com.google.kotlin.section2


//https://www.programiz.com/kotlin-programming/recursion
fun main(args: Array<String>) {
    println(fibonacci(2))
    println(fibonacci(3))
    println(fibonacci(5))
    println(fibonacci(6))
    println(fibonacci(10))

}

//numbers
// 1 1 2 3 5 8 13 21 34 55...
//positions
// 1 2 3 4 5 6 7   8  9  10...
fun fibonacci(position: Int): Int {
    return when (position) {
        0 -> 0
        1 -> 1
        else -> fibonacci(position - 1) + fibonacci(position - 2)
    }
}

