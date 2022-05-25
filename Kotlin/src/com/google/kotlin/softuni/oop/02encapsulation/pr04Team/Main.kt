package com.google.kotlin.softuni.oop.`02encapsulation`.pr04Team



fun main() {
    val p1 = Person("John", 25)
    val p2 = Person("Peter", 30)
    val p3 = Person("Ivan", 47)
    val p4 = Person("Linda", 50)
    val team = Team("Protorix")
    team.addPlayer(p1)
    team.addPlayer(p2)
    team.addPlayer(p3)
    team.addPlayer(p4)


    val firstTeam = team.firstTeam
    val reserveTeam = team.reserveTeam

    val frstTeam = team.getFrstTeam()
    firstTeam.add(p1)
    println()
}