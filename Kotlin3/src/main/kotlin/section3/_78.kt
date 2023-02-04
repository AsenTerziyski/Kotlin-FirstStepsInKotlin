package section3

fun main() {
    println(volume(
        height = 15.0,
        width = 10.0
    ))


    println(volume(10.0, 10.0, 50.0))

    val list = intArrayOf(1,2,3)
    println(total(*list))
}

private fun volume (height: Double, width: Double, length: Double = 20.0) = height * width * length
private fun total (vararg ints : Int) = ints[0] + ints[1] + ints[2]