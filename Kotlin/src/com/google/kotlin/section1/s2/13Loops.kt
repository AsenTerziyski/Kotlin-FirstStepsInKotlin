package com.google.kotlin.section1.s2

import java.lang.Exception
import java.util.*

fun main() {
//    WAP to com.google.kotlin.section2.print even numbers between first and second
    val scanner = Scanner(System.`in`)
    val first: Int
    val second: Int

    try {
        first = scanner.nextLine().toInt()
        second = scanner.nextLine().toInt()

        // for loop
        when {
            first < second -> for (i in first..second) {
                printEvenNumber(i)
            }
            second < first -> for (i in second..first) {
                printEvenNumber(i)
            }
            first % 2 == 0 -> printEvenNumber(first)
            else -> println("$first is not in even number")
        }

        // while loop
        var count = 0;
        when {
            first < second -> {
                count = first
                print(count, second)
            }
            second < first -> {
                count = second
                while (count < first) {
                    printEvenNumber(count)
                    count++
                }
            }
            second % 2 == 0 -> printEvenNumber(second)
            else -> println("$first is not in even number")
        }

    } catch (e: Exception) {
        println(e.message)
        throw Exception(e.message)
    }

    // do - while
    var i = 1
    do {
        if (i % 2 == 0) {
            println(i)
        }
        i++
    } while (i <= 10)

}

private fun print(low: Int, high: Int) {
    var count = low
    while (count <= high) {
        printEvenNumber(count)
        count++
    }
}

fun printEvenNumber(i: Int) {
    if (i % 2 == 0) {
        println(i)
    }
}
