package com.google.kotlin.commons.classes

import com.google.kotlin.section1.s5.format
import kotlin.math.pow

fun main() {
    println("PROGRAM STARTED!")
    val baseCircle = object {
        val radius = 10.0
        fun getCircleArea(): Double {
            return Math.PI * radius.pow(2.0)
        }
    }

    val cylinder = Cylinder(10.0, baseCircle.getCircleArea())
    println("V = " + cylinder.getVolume().format(0) + "m3")
    println("H = " + cylinder.getCylinderHeight().format(2) + "m")

    try {
        val cylinder2 = Cylinder(-100.00, baseCircle.getCircleArea())
        println("V = " + cylinder2.getVolume().format(0) + "m3")
        println("H = " + cylinder2.getCylinderHeight().format(2) + "m")
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("PROGRAM STOPPED!")
    }

    println(Casio.myPow(2.00, 2.0))
    println(Casio.sum(2.0, 8.0))
    println(Casio.multiply(10.0, 10.0).format(2))
}

class Cylinder(inputHeight: Double, private val baseArea: Double) {
    init {
        if (inputHeight <= 0) {
            println("Could not init cylinder!")
            throw Exception("Input height should be greater than zero!")
        }
        println("Init cylinder...")
    }

    private val height: Double = inputHeight

    fun getVolume(): Double {
        return height * baseArea;
    }

    fun getCylinderHeight(): Double {
        return this.height
    }
}

open class Calculator {
    fun sum(a:Double, b:Double):Double {
        return a + b;
    }
}

object Casio: Calculator() {
    fun multiply(a:Double, b:Double):Double {
        return a*b
    }

    fun myPow(base:Double, a:Double):Double {
         return base.pow(a)
    }
}