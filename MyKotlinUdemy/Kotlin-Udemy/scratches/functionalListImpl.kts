abstract class LinkedList<out T : Any>

data class Cons<out T : Any>(
    val head: T,
    val tail: LinkedList<T>
) : LinkedList<T>() {
    override fun toString() = "$head -> $tail"
}

object Nil : LinkedList<Nothing>() {
    override fun toString(): String {
        return "Nil"
    }
}

Cons("Helllo", Cons("Hiiii", Cons("Zdvasss", Nil)))