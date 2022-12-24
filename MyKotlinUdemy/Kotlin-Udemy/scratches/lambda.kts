val test = { s: String, c: Int -> "$s => $c" }

test.invoke("test", 100)
test("test2", 200)

fun test3(a: (String, String) -> Int): Int {
    val test = a.invoke("", "")
    return test
}

fun test4(): ((String, String) -> Int) =
    { a, b -> a.length + b.length }

test4().invoke("One", "Two")

val seq = generateSequence(0) { it.inc() }
seq.take(1000).forEach { print(" $it") }

fun a(b: String, c: String) = b.length + c.length
val aLambda = ::a

aLambda.invoke("Test", "Test2")

arrayOf("Test", "Test2", "Test33")
    .map { it.length }
    .forEach(::print)