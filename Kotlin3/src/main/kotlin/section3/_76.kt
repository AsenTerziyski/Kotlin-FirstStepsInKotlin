package section3

fun main() {
    val cm = inchToCm(10.0F)
    val cm2 = inchToCm(-2.0F)
    println(cm)
    println(cm2)
}

fun inchToCm(inch: Float) = if (inch > 0) (inch * 2.54) else 0.0F

