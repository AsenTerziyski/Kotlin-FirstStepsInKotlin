package com.google.kotlin.commons

import com.google.kotlin.section2.a

fun main(args: Array<String>) {
    val buildOrder = FoodOrder
        .Builder()
        .condiments("olive oil")
        .bread("white bread")
        .meat("bacon")
        .fish(null)
        .build()

    println(buildOrder.bread)
    println(buildOrder.meat)
    println(buildOrder.fish)
    println(buildOrder.condiments)
}

class FoodOrder private constructor(
    val bread: String?,
    val condiments: String?,
    val meat: String?,
    val fish: String?
) {

    data class Builder(
        var condiments: String? = null,
        var bread: String? = null,
        var meat: String? = null,
        var fish: String? = null
    ) {
        fun condiments(condiments: String) = apply { this.condiments = condiments }
        fun bread(bread: String) = apply { this.bread = bread }
        fun meat(meat: String?) = apply { this.meat = meat }
        fun fish(fish: String?) = apply { this.fish = fish }
        fun build() = FoodOrder(bread, condiments, meat, fish)
    }

}