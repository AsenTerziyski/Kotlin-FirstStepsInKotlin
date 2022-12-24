data class Person(var name: String, var age: Int)

val jon = Person("Jon", 30)
//jon.name = "John"

var olderJon = jon.copy(age = 75)

fun Person.getAge(age: Int) = age

jon.getAge(jon.age)
olderJon.getAge(olderJon.age)
