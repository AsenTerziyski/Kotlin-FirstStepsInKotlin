package com.google.kotlin.softuni.oop.`01abstraction`.pr02

import java.util.*

fun main() {
    val input = Scanner(System.`in`).nextLine()
    val cardRanks = CardRank.values()
    for (cardRank in cardRanks) {
        for (value in CardSuite.values()) {
            println("%s %s".format(value.name, cardRank.name))
        }
    }

}