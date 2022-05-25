package com.google.kotlin.softuni.oop.`01abstraction`.pr04

class TrafficLight(var trafficLightState: TrafficLightState) {

     fun updateState() {
        when (this.trafficLightState.name) {
            "RED" -> this.trafficLightState = TrafficLightState.GREEN
            "GREEN" -> this.trafficLightState = TrafficLightState.YELLOW
            "YELLOW" -> this.trafficLightState = TrafficLightState.RED
        }
    }

    override fun toString(): String {
        return "$trafficLightState"
    }

}