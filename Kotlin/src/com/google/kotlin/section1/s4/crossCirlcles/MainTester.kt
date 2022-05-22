package com.google.kotlin.section1.s4.crossCirlcles

import java.util.*
import kotlin.math.pow

class MainTester {
    fun testIfTwoCirclesAreCrossing() {
        val scanner = Scanner(System.`in`)

        print("X1 = ")
        val x1 = scanner.nextLine().toDouble()
        print("y1 = ")
        val y1 = scanner.nextLine().toDouble()
        print("R1 = ")
        val r1 = scanner.nextLine().toDouble()
        print("X2 = ")
        val x2 = scanner.nextLine().toDouble()
        print("y2 = ")
        val y2 = scanner.nextLine().toDouble()
        print("R2 = ")
        val r2 = scanner.nextLine().toDouble()

        if (r1 <= 0 || r2 <= 0) {
            throw Exception ("Radius of any of the circles can not be zero or negative!")
        }

        val center1 = Point(x1, y1)
        val circle1 = Circle(center1, r1)

        val center2 = Point(x2, y2)
        val circle2 = Circle(center2, r2)

        val sumOfRadiuses = circle1.radius + circle2.radius

        val a = circle1.center.x - circle2.center.x
        val b = circle1.center.y - circle2.center.y

        val sumOfaAndbSquares = a.pow(2) + b.pow(2)
        val sumOfRadiusesSquere = sumOfRadiuses.pow(2)

        if (sumOfaAndbSquares <= sumOfRadiusesSquere) {
            println("Circles are crossing.")
        } else if (sumOfaAndbSquares == sumOfRadiusesSquere) {
            println("Circles се допират.")
        } else {
            println("Circles are not crossing!")
        }

    }

}