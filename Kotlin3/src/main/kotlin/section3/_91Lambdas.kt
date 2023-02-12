package section3

fun main() {
    val sumTwoNumbers = {a: Int, b: Int -> a+b}
    val sum = sumTwoNumbers(2,3)
    println(sum)

    println(Calculator.sum(1, 2))
    println(Calculator.areaAsString(25.0))
    Calculator.printArea(5.0)
    val listToGroup = listOf<String>("a", "aa", "aaa", "b", "ab", "aab","c", "ac", "acb")
    println(Calculator().groupByLength(listToGroup))


}

