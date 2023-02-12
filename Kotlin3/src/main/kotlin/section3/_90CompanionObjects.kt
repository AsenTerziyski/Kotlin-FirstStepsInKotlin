package section3

fun main() {
    println(CameraMode.setMode().mode)
    println(CameraMode.setMode(shutter = 1000).mode)
    println(CameraMode.setMode(aperture = 0.1).mode)
    println(CameraMode.setMode(shutter = 10000, aperture = 0.1).mode)

}

class CameraMode private constructor(val mode: String) {
    companion object {
        fun setMode(shutter: Int = 0, aperture: Double = 0.0) =
            when {
                shutter > 0 && aperture > 0.0 -> CameraMode("manual")
                shutter > 0 -> CameraMode("shutter mode")
                aperture > 0.0 -> CameraMode("aperture mode")
                else -> CameraMode("auto")
            }
    }
}