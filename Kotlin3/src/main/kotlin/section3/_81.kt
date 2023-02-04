package section3

fun main() {
    println(checkNumber("Test"))
    println(checkNumber(null))


    val total: Any = 123
    val total2 = object :Run(null) {}
    val total3 = object :Run(456) {}
    val runs = (total as? Run)?.runs ?: 0
    val runs2 = (total2 as? Run)?.runs ?: 100
    val runs3 = (total3 as? Run)?.runs ?: 100
    println(runs)
    println(runs2)
    println(runs3)


}

fun checkNumber(data: String?) = data ?: "$data!"
