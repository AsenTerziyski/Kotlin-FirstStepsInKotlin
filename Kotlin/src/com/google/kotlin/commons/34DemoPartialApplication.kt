package com.google.kotlin.commons

fun main(args: Array<String>) {
    println(testPrice(100.0, 0.1, 10.0))

    // with partial:
    val price200 = ::testPrice.partial(100.0)
    println(price200(0.1, 10.0))

    println(testVolume(10.0, 10.0, 10))
    println(testVolume(1.0, 1.0, 10))

    //takes a = 1000, not a = 100 like testVolume function below:
    val partialParam1000 = ::testVolume.partialParam(1000.0)
    println(partialParam1000.invoke(1.0, 1))

    val partialParam750 = ::testVolume.partialParam(750.0)
    println(partialParam750.invoke(10.00, 10))

    println(volume100(50.0, 75))

}

// R stands for result
fun <T1, T2, T3, R> ((T1, T2, T3) -> R).partial(t1: T1): (T2, T3) -> R =
    { t2, t3 -> this.invoke(t1, t2, t3) }

fun testPrice(original: Double, discount: Double, fDiscount: Double) =
    original * (1 - discount) - fDiscount

// fDiscount - fixed discount
fun price200(fDisc: Double, disc: Double) = testPrice(200.0, disc, fDisc)

//V stands for result volume:
fun <A, B, H, V> ((A, B, H) -> V).partialParam(a: A): (B, H) -> V =
    { b, h -> this.invoke(a, b, h) }

fun testVolume(a: Double, b: Double, h: Int):String {
    val volume = a*b*h
    return "Volume is: %.2fm2".format(volume)
}

fun volume100(b: Double, h: Int):String {
    return testVolume(100.0, b,h )
}