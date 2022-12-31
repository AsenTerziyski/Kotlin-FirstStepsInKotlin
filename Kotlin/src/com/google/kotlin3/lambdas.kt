package com.google.kotlin3

fun main() {
    val sum = { v1: Int, v2: Int -> v1 + v2 }
    val s = sum(2, 5)
    println(s)

    val sum2: (Int, Int) -> Int = { v1, v2 -> v1 + v2 }
    println(sum2(3, 7))

    val words = listOf<String>("ab", "bc", "abc", "dcb", "a", "bg", "bgh", "mn")
    println(groupByLength(words))

    println(groupContains("ab", words).values)
}

fun groupByLength(values: List<String>): Collection<List<String>> =
    values.groupBy { word: String -> word.length }.values

fun groupContains(content: String, values: List<String>) =
    values.groupBy { it.contains(content) }

