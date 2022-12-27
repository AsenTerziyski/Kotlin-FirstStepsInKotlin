package com.google.kotlin3

import java.text.DateFormat
import java.util.*

fun main() {
    val date = Date()
    println(date.getMyDate())


}

fun Date.getMyDate() : String = "Current date is " + DateFormat.getDateInstance().format(this)