fun <T1, T2, R> ((T1) -> T2).andThen(f: (T2) -> R): (T1) -> R =
    { t1 -> f(this(t1)) }

fun doubleStr(s: String): String = s + s
fun strLength(s: String) = s.length

val a = ::doubleStr.andThen(::strLength)
println(a("12345"))

fun triple(int: Int) = int * 3
val b = ::doubleStr.andThen(String::length)
b.invoke("12345")
val c = ::doubleStr.andThen(String::length).andThen(::triple)
c.invoke("12345")

listOf("1", "12", "123").map(c).forEach(::print)
listOf("1", "12", "123").map(c).forEach { println("--$it--")}