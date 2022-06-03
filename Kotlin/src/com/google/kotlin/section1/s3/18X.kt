package com.google.kotlin.section1.s3

import com.google.kotlin.commons.format
import java.lang.Math.pow

fun main() {
    println("V = " + findCVolume(height = 10.0, radius = 10.0).format(3) + "m3")
}

fun findCVolume(radius: Double, height: Double): Double {
    println("For rad = $radius and height = $height the volume is:")
    return Math.PI * pow(radius, 2.0) * height
}