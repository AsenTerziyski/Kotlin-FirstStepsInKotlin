package com.google.kotlin.softuni.oop.`01abstraction`.pr04

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val initialTrafficLights = scanner.nextLine().split("\\s+".toRegex())
    val numberOfUpdates: Int = scanner.nextLine().toInt()

    val mutableListOf = mutableListOf<TrafficLight>()
    for (initialTrafficLight in initialTrafficLights) {
        val trafficLight = TrafficLight(TrafficLightState.valueOf(initialTrafficLight))
        mutableListOf.add(trafficLight)
    }

    for (i in 0..numberOfUpdates) {
        for (trafficLight in mutableListOf) {
            trafficLight.updateState()
            print("$trafficLight ")
        }
        println()
    }

}