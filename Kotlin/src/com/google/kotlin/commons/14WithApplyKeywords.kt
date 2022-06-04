package com.google.kotlin.commons

fun main(args: Array<String>) {
    val test = TestClass()
    println(test.apply { name = "John"; age = 10 }.toString())

    val test2 = TestClass()
    println(test2.apply { name = "Peter"; age = 15 }.toString())

    val test3 = TestClass()
    with(test3) {
        name = "Angel"; age = 25
    }

    println(test3.toString())

}

class TestClass {
    var name: String = ""
    var age: Int = -100
    var instanceCounter = getInstanceCount()

    companion object {
        var count = 0;
        fun getInstanceCount(): Int {
            return ++count
        }
    }

    override fun toString(): String {
        return "%d |name: %s -> age: %d -> ID: INSTNC№%d000|".format(this.instanceCounter, this.name, this.age, this.instanceCounter)
    }
}