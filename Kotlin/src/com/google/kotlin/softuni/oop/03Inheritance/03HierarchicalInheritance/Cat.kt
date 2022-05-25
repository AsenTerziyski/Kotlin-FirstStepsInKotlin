package com.google.kotlin.softuni.oop.`03Inheritance`.`03HierarchicalInheritance`

import kotlin.reflect.KClass

class Cat:Animal() {
    fun mauu () {
        //take class name
        //https://stackoverflow.com/questions/32655216/kotlin-equivalent-of-getclass-for-kclass
        val split = getClass().toString().split("\\.".toRegex())
        val className = split.get(split.size - 1)
        println("$className Myauuu, Myauuu...")
    }

    fun<T: Cat> T.getClass(): KClass<T> {
        return javaClass.kotlin
    }

}