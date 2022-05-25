package com.google.kotlin.softuni.oop.`01abstraction`.pr03

import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    val cardRank = input.nextLine()
    val rankSuite = input.nextLine()

    val card = Card(CardRank.valueOf(cardRank), CardSuite.valueOf(rankSuite))
    println(card.toString())

}