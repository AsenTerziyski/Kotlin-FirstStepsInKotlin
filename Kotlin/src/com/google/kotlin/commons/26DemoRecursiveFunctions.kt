package com.google.kotlin.commons

//https://www.programiz.com/kotlin-programming/recursion
//A function that calls itself is known as recursive function.
//To avoid infinite recursion,
//if...else (or similar approach) can be used where
//one branch makes the recursive call and other doesn't.

/*
What is tail recursion?
In normal recursion,
you perform all recursive calls first,
and calculate the result from return values at last.
Hence, you don't get result until all recursive calls are made.

In tail recursion,
calculations are performed first,
then recursive calls are executed
(the recursive call passes the result of your current step to the next recursive call).
This makes the recursive call equivalent to looping, and avoids the risk of stack overflow.

A recursive function is eligible for tail recursion
if the function call to itself is the last operation it performs.

To tell compiler to perform tail recursion in Kotlin,
you need to mark the function with tailrec modifier.
 */
fun main() {

//    try {
//        println(sumNumbersFromNtoOne(0))
//    } catch (e:Exception) {
//        println(e.message)
//    }

    println(sumNumbersFromNtoOneSecond(1000000000))
    println(sumNumbersFromNtoOneSecond(3))
    println(sumNumbersFromNtoOneSecond(2))
    println(sumNumbersFromNtoOne(1))
    println(sumNumbersFromNtoOne(2))
//    println(factorialFunction(1))
//    println(factorialFunction(2))
//    println(factorialFunction(3))

//    try {
//        println(sumNumbersFromNtoOne(100000))
//    } catch (e: Exception) {
//        println(e.message)
//    }

//    4, 3, 2, 1 => 4 * 3 * 2 * 1 = 24
    println(factorialFunction(4))
//    factorial(4)              // 1st function call. Argument: 4
//    4*factorial(3)            // 2nd function call. Argument: 3
//    4*(3*factorial(2))        // 3rd function call. Argument: 2
//    4*(3*(2*factorial(1)))    // 4th function call. Argument: 1
//    factorial(1) => returns 1
//    4*(3*(2*1))
//    24

    val number = 5
    println("Factorial of $number = ${factorialFunctionWithT(number)}")

}

fun sumNumbersFromNtoOne(x: Long): Long = when (x) {
//    0L -> throw Exception("N should be 1 or greater!")
    1L -> 1L
    else -> x + sumNumbersFromNtoOne(x - 1L)
}

tailrec fun sumNumbersFromNtoOneSecond(x: Long, run: Long = 1L): Long =
    when (x) {
        1L -> run
        else -> sumNumbersFromNtoOneSecond(x - 1, run + x)
    }

fun factorialFunction(n: Int): Long {
    return if (n == 1) {
        n.toLong()
    } else {
        n * factorialFunction(n - 1)
    }
}

//5 = 5 * 4 * 3 * 2 * 1 = 120
tailrec fun factorialFunctionWithT(n: Int, run: Int = 1): Long {
    return if (n == 1) {
        println(" -- n=%d -> run=%d".format(n, run))
        run.toLong()
    } else {
        println(" -- n=%d -> run=%d".format(n, run))
        factorialFunctionWithT(n - 1, run * n)
    }

}


