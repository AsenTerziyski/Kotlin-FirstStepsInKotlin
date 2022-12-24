data class Tuple<R,T>(var a: R, var b: T)

fun getInts() = Tuple(700.25,2)
var result = getInts()
var multiply = result.a * result.b
println(multiply)
