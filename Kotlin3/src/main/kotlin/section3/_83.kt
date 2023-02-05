package section3

fun main() {
    val scores = arrayOf<Int?>(1, null, 3, 5, 4, 8, null, 4, null)

    scores.filterNotNull().forEach { println(it) }

    val scoresNotNulls = listOfNotNull(*scores)
    scoresNotNulls.map { "$it" }.forEach (::print)
}