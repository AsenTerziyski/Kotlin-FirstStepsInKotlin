import java.util.*

var intList = listOf(0, 1, 2, 3, 4, 5)
var doubled = intList.map { it -> it * 2 }
var flatM = intList.flatMap { it -> listOf(it, it * 4) }
fun test(n: Int): String = "$n -> "
flatM.map(::test).forEach(::print)

//monads
data class Container<T>(private val obj: T) {
    fun <R> myMap(transformer: (T) -> R): Container<R> = Container(transformer(obj))
    fun <R> myFlatMap(transformer: (T) -> Container<R>) = transformer(obj)
}

val myC = Container(2).myMap { "->>>> $it <<< " }
println(myC)

val myC2 = Container(2).myFlatMap { Container(it * 200 + it) }
println(myC2)

Optional.of(3).map { it * 100 + it }.flatMap { Optional.of(it + 1000) }
Optional.empty<Int>().map { it * 200 + 2 * it }.flatMap { Optional.of(it + 1000) }