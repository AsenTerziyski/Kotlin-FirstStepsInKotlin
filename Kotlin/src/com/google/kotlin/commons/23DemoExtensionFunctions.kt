package com.google.kotlin.commons

fun main(args: Array<String>) {
    val camera = TestCamera("Canon")
    camera.openCamera()
    camera.takePicture("Portrait")
    camera.applyFilter("Gray")
    camera.savePicture()
}

class TestCamera (name: String) {
    var name: String = name
        set(value) {
            if (value.isBlank()) {
                throw Exception("Not valid name.")
            }
            field = value
        }

    fun openCamera() {
        println("${this.name} opened.")
    }

    fun takePicture(type:String) {
        println("${this.name} clicked $type. Now save it...")
    }

    fun savePicture() {
        println("Picture saved in the internal memory of ${this.name}")
    }
}

fun TestCamera.applyFilter(typeFilter:String) {
    println("${this.name} applied filter: $typeFilter.")
}