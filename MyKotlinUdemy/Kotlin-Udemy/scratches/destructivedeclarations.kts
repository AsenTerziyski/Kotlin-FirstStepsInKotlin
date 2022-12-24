val pair = Pair<String, Int>("Str", 1)
val pair2 = "Str2" to 2

println(pair.component1() + "->" + pair.component2())
println(pair2.first + "--" + pair2.second)

data class Dog(val name: String, val kilos: Double, val age: Int)

val dog = Dog("Smith", 75.25, 15)

println(dog.component1() + "-" + dog.component2() + "-" + dog.component3())