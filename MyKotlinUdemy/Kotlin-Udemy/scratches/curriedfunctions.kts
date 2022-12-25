fun <T1, T2, R> ((T1, T2) -> R).myCurried(): (T1) -> (T2) -> R =
    { t1: T1 -> { t2: T2 -> this(t1, t2) } }

fun lengthSum(str1: String, str2: String) = str1.length + str2.length

val curried = ::lengthSum.myCurried()

val sumLength = curried.invoke("A1").invoke("B23")
val sumLength2 = curried("A")("B")

println(sumLength)
println(sumLength2)

