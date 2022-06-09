package com.google.kotlin.section2

//import javafx.beans.binding.When

fun main(args: Array<String>) {
//    println(sum(5))
//    println(sum(10))
//    println(sum(100))
//    println(sum(1000))

    println(sumTwo(5))
//    println(sumTwo(1000000000))
}

// 1 + 2 + 3 + 4 + 5 = 15
fun sum(x: Long): Long = when (x) {
    1L -> 1L
    else -> x + sum(x - 1L)
}


// 1 + 2 + 3 + 4 + 5 = 15
tailrec fun sumTwo(x: Long, run: Long = 1L): Long =
    when (x) {
        1L -> run
        else -> sumTwo(x - 1, run + x)
    }


//fun sum(x:Long):Long {
//    if (x == 1L) {
//        return 1L
//    }
//
//    return x + sum(x - 1L)
//}

//tailrec fun sumTwo(x:Long):Long = when(x) {
//
//    1L -> 1L
//    else -> x + sumTwo(x - 1L)
//}