package com.google.kotlin.commons

fun main(args: Array<String>) {
    println(lazyOne(1, 2, true))
    println(lazyOne(1.0, "Test", false))
    val lazyOne = lazyOne("A", b = true, isA = false)
    println(lazyOne)

    val lazyLambda = { s: String -> "S is %s".format(s) }
    val lazyLambda2 = { n: Int -> 2 * n }
    println(lazyLambda.invoke("test"))
    val lazyTwo = lazyTwo("a", 1, { lazyLambda }, { lazyLambda2 }, true)
    lazyTwo.toString()

    println(lazyTwo)
}

fun lazyOne(a: Any, b: Any, isA: Boolean): Any {
    return if (isA) a
    else b
}

fun lazyTwo(first: Any, second: Any, a: (Any) -> Any, b: (Any) -> Any, isFirst: Boolean): Any {
    return if (isFirst) a.invoke(first)
    else b.invoke(second)
}