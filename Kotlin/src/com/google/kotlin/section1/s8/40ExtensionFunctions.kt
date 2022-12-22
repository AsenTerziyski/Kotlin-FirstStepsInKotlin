package com.google.kotlin.section1.s8

fun main(args: Array<String>) {
    val camera = Camera()
    camera.openCamera()
    camera.takePicture()
    camera.applyFilter()
    camera.savePicture()
    camera.checkBattery()
}

fun Camera.applyFilter() {
    println("Filter applied!")
}


fun Camera.checkBattery() {
    println("Checking battery!")
}
class Camera {
    fun openCamera () {
        println("Camera opened!")
    }

    fun takePicture () {
        println("Picture clicked. Save it!")
    }

    fun savePicture() {
        println("Picture saved in memory")
    }
}