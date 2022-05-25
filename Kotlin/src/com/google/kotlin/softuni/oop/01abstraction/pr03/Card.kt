package com.google.kotlin.softuni.oop.`01abstraction`.pr03

class Card(rank: CardRank, suite: CardSuite) {
    var power: Int? = -1
    var rank: CardRank? = rank
    var suite: CardSuite? = suite

    init {
        calculatePower()
    }

    private fun calculatePower() {
        val value = this.rank?.value
        val suite = this.suite?.value
        if (value != null && suite != null) {
            this.power = value + suite
        }
    }

    override fun toString(): String {
        if (power !=-1 && this.power != null && this.suite !=null){
        return "Card name: %s of %s; Card power: %d".format(this.rank, this.suite!!.name, this.power)
        } else {
            throw Exception ("Blyaskkk!")
        }
    }


}