package com.google.kotlin.SECTION1.s4

fun main(args: Array<String>) {

    var user1 = User("Peter", 1)
    var user2 = User("Peter", 1)

    if (user1 == user2)
        println("Users are equal.")
    else
        println("Users are no equal.")

}

data class User(var name: String, var id: Int) {

}

