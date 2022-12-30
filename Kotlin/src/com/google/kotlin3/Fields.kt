package com.google.kotlin3

fun main() {
    val asen = User(100, "asen")
    println("${asen.id} => ${asen.name} -> c = ${User.getInstanceCount()}")

    val ivan = User(101, "Ivan")
    println("${ivan.id} => ${ivan.name} -> c = ${User.getInstanceCount()}")

    val scores = arrayListOf<Double>(1.0, 3.0, 0.0, 5.0, 6.0, 0.0, 2.0, 0.0, 0.0)
    val examResults = ExamResults()
    examResults.results = scores
    println(examResults.results)

}


class ExamResults {
    var results: ArrayList<Double>? = null
    set(value) {
        value?.removeAll(arrayListOf(0.0))
        field = value
    }
}

class User(anId: Int, aName: String) {
    val id = anId
        get() = field * 2
    val name = aName
        get() = field.capitalize()

    companion object {
        private var count = 0;
        fun getInstanceCount(): Int {
            return ++count
        }
    }
}