package com.google.kotlin.section1.s6


fun main(args: Array<String>) {

    val circleArea: (Double) -> Double = { r: Double -> Math.PI * r }

    val area = findCircleArea(5, circleArea)
    println(area)

    // void function
    val result: (Int, Int) -> Unit = { a: Int, b: Int -> println(a + b) }
    functionAddAndPrint(2, 5, result)

    val cubeVolume: (Double, Double, Double) -> Double = { a: Double, b: Double, h: Double -> a * b * h }
    var volume = findVolumeOfCube(1.0, 2.0, 3.0, cubeVolume)
    println(volume)
    println(1.7556.format(2))
    println("The volume is %.3f %c".format(volume, 'a'))

    val fullNameLambda: (String, String) -> String = { str1, str2 -> "$str1 $str2" }
    println(concatTwoNames("Asen", "Terziyski", fullNameLambda))
    println(concatTwoNames("John", "Smith", fullNameLambda))

    val fullNameLambdaWithSeparator: (String, String, String) -> String =
        { str1, separator, str2 -> str1 + separator + str2 }

    concatTwoNameWithSeparatorBetween("John", "Smith", " + ", fullNameLambdaWithSeparator)


}

fun concatTwoNameWithSeparatorBetween(
    firstName: String, lastName: String, separator: String,
    fullNameLambdaWithSeparator: (String, String, String) -> String
)
{
    println(fullNameLambdaWithSeparator(firstName, separator, lastName))
}

fun concatTwoNames(firstName: String, lastName: String, nameLambda: (String, String) -> String): String {
    return nameLambda(firstName, lastName)
}


fun findVolumeOfCube(a: Double, b: Double, h: Double, cubeVolume: (Double, Double, Double) -> Double): Any {
    return cubeVolume(a, b, h)
}

fun functionAddAndPrint(a: Int, b: Int, myFunction: (Int, Int) -> Unit) {
    return myFunction(a, b)
}

fun findCircleArea(radius: Int, circleArea: (Double) -> Double): Double {
    return circleArea(1.0)
}

fun Double.format(digits: Int) = "%.${digits}f".format(this)