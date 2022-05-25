package com.google.kotlin.softuni.oop.`02encapsulation`.human

fun main() {
    val p1 = Person("Ivan", 11)
    val count = Person.Count
    println(Person.Count.invoke())
    val p2 = Person("John", 15)
    val count1 = Person.Count
    println(Person.Count.invoke())
    val p3 = Person("Josh", 12)

    val count3 = Person.Count
    println(Person.Count.invoke())
    val l = mutableListOf<Person>(p1, p2, p3)
    var cnt = 1
//    for (person in l) {
//        if (cnt >= 9) {
//            println("$cnt ${person.name} => ${person.age} ${person.personId}!")
//        } else {
//            println("0$cnt ${person.name} => ${person.age} ${person.personId}!")
//        }
//
//        cnt++
//    }

    val student = Student("Ivancho", 18, "Bleki")
    println(student.school)
    println("${student.name}, age: ${student.age} ${student.school}  ${student.personId}")
    student.study()
    val worker = Worker("Jason", 55, "BlekiKompan", 800.0)
    println(worker.toString())
    l.add(student)
    l.add(worker)
    for (person in l) {
        if (cnt >= 9) {
            println("$cnt ${person.name} => age: ${person.age} ${person.personId}!")
        } else {
            if (person == worker) {
                println("0$cnt Person ${person.name}, age: ${person.age} is a worker with salary: " + worker.getWorkerSalary() + "!")
            } else {
                println("0$cnt ${person.name} => age: ${person.age} ${person.personId}!")
            }
        }
        cnt++
    }

    student.eat()


}
