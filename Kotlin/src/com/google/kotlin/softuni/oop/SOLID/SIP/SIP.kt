package com.google.kotlin.softuni.oop.SOLID.SIP

fun main(args: Array<String>) {

    val mainRole = Role.MAIN
    println()

    println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
    val hero = Hero()
    hero.name = "Beast"
    hero.role = mainRole
    var heroPrinter0 = HeroPrinter(hero)
    heroPrinter0.printHeroInfo()
    heroPrinter0.printHeroReference()
    println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
    println()

    val heroSettings = HeroSettings(hero)
    heroSettings.changeName("Zeus")
    heroSettings.selectRole(Role.SECONDARY)
    val modifiedHero = heroSettings.takeModifiedHero()

    println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
    val heroPrinter1 = HeroPrinter(modifiedHero)
    heroPrinter1.printHeroInfo()
    heroPrinter1.printHeroReference()
    println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
    println()
    println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
    println((hero.toString() == modifiedHero.toString()).toString().toUpperCase() + "!")
    println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")

}


interface PersonSettings {
    fun changeName(newName: String): String
    fun selectRole(newRole: Role): String
}

enum class Role {
    MAIN,
    SECONDARY
}

class HeroSettings(var hero: Hero) : PersonSettings {

    override fun changeName(newName: String): String {
        if (newName.isBlank()) {
            throw IllegalArgumentException("New name can not be empty!")
        }
        this.hero.name = newName
        return this.hero.name;
    }

    override fun selectRole(newRole: Role): String {
        this.hero.role = newRole
        return this.hero.role.toString()
    }

    fun takeModifiedHero(): Hero {
        return this.hero
    }

}

class HeroPrinter(var hero: Hero) {

    fun printHeroReference() {
        val split = hero.toString().split("\\.".toRegex())
        println("=>>>>" + split[split.size - 1].toUpperCase())
    }

    fun printHeroInfo() {
        println("The name of modified hero is ${this.hero.name} and its role is ${this.hero.role?.name}!")
    }

}

class Hero {

    var name: String = ""
        set(value) {
            if (value.isBlank()) {
                throw IllegalArgumentException("Name can not be empty.")
            }
            field = value
        }

    var role: Role? = null
        set(value) {
            if (value == null) {
                throw IllegalArgumentException("Role can not be null.")
            }
            field = value
        }

}

