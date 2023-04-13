package test

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


fun main() = runBlocking{
    val result = doWorkAsync("Work")
    val answer = result.await()

    val result2 = async { doWork("Test") }


    println("The answer is $answer")

    println("The answer 2 is ${result2.await()}")
}

fun doWorkAsync(msg: String) = GlobalScope.async {
    aLog("$msg Working")
    delay(500)
    aLog("$msg Work done")
    return@async 42
}

fun doWork(msg: String) = GlobalScope.async {
    aLog("$msg Working")
    delay(500)
    aLog("$msg Work done")
    return@async 4200
}

fun aLog(msg: String) = println("$msg in ${Thread.currentThread().name}")