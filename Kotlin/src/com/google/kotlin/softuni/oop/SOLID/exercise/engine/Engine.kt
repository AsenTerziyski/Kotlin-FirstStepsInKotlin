package com.google.kotlin.softuni.oop.SOLID.exercise.engine

import java.io.BufferedReader
import java.io.InputStreamReader

class Engine: Runnable {
    override fun run() {
        println("START ENGINE!")
        val reader = BufferedReader(InputStreamReader(System.`in`))
        val appCount = reader.readLine().toInt()


        println("STOP ENGINE!")
    }
}