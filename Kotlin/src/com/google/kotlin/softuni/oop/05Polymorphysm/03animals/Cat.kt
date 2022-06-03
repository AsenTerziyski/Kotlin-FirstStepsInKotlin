package com.google.kotlin.softuni.oop.`05Polymorphysm`.`03animals`

import kotlin.reflect.KClass

class Cat(var owner: String) : Animal() {

    override fun toString(): String {
        val split = getClass().toString().split("\\.".toRegex())
        val className = split[split.size - 1]
        return ("I am a %s, my name is %s,%n" +
                "my owner is %s and my" +
                "%nfavorite food is %s!")
            .format(
                className.toUpperCase(),
                super.getName().toUpperCase(),
                owner.toUpperCase(), super.getFavouriteFood()
            )
    }

    private fun Cat.getClass(): KClass<Cat> {
        return javaClass.kotlin
    }
}