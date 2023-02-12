package section3

import kotlin.random.Random

fun main() {

    val user = UserAccount(1, "Peter", "Leader")
        println(user.id)
        println(user.firstName)
        println(user.position)

    val r = Results()
    r.results = arrayListOf<Double>(1.0, 0.0, 6.0, 3.0)
    println(r.results)
}

class Results {
    var results : ArrayList<Double>? = null
    set(value) {
        value?.removeAll(arrayListOf(0.0,1.0))
        field = value
    }
}

class UserAccount(_id: Int, _name: String, _position: String) {
    val id = _id
    get() {
        val random = Random(field)
        return random.nextInt()
    }
    val firstName = _name
    get() {
        val test = "-"
        return test + field
    }
    val position = _position
        get() = field.toUpperCase()
}