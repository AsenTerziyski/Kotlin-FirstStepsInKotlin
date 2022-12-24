fun sum(n: Long): Long = when (n) {
    1L -> 1L
    else -> n + sum(n - 1)
}

sum(500L)

try {
    sum(5000L)
} catch (e:Exception) {
    println(e.message)
}

tailrec fun sum2(n: Long, run: Long = 1): Long =
    when (n) {
        1L -> run
        else -> sum2(n - 1, run + n)
    }

sum2(50000000000)