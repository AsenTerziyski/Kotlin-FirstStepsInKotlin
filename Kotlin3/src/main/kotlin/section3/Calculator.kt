package section3

import kotlin.math.pow

class Calculator {
    fun groupByLength(value: List<String>): Collection<List<String>> = value.groupBy { it.length }.values
    companion object {
        val sum: (Int, Int) -> Int = { a, b -> a + b }
        val area: (Double) -> Double = { rad -> Math.PI * rad.pow(2.0) }
        val areaAsString: (Double) -> String = { rad -> String.format("Area is: %s", Math.PI * rad.pow(2.0)) }
        val printArea: (Double) -> Unit = { rad ->
            println(String.format("Printed area is %.2f square cm", Math.PI * rad.pow(2.0)))
        }


    }
}