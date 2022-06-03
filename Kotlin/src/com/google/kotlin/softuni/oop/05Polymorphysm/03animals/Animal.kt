package com.google.kotlin.softuni.oop.`05Polymorphysm`.`03animals`

import kotlin.reflect.KClass

abstract class Animal {
    private var name: String = ""
    private var favouriteFood: String = ""

    fun animal(name: String, favouriteFood: String) {
        this.name = name
        this.favouriteFood = favouriteFood
    }

    protected fun getName(): String {
        return name
    }

    protected fun getFavouriteFood(): String? {
        return favouriteFood
    }

    fun explainSelf(): String? {
        return ("I am "
                + getName()
                + " and my favourite food is "
                + getFavouriteFood())
    }

    fun<T: Animal> T.getClass(): KClass<T> {
        return javaClass.kotlin
    }
}