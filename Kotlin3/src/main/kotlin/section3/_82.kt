package section3

fun main() {
    var test: Int? = null

    println(test?.let { println(convertToPoints(it)) } ?: -1000)

    test = 7

    test?.let { println(convertToPoints(it)) }
}

private fun convertToPoints(tries: Int) = 100 * tries + 100