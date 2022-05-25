package com.google.kotlin.softuni.oop.`03Inheritance`.exercises.pr01

open class Person(name: String, age:Int){
    var name:String = name
    var age: Int = age
    override fun toString(): String {
        return "Person with name $name and age $age."
    }


}