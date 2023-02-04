package section3

import java.lang.IllegalArgumentException

fun main() {

    println(checkAgeIfCanDriveInCountry(25))
    println(checkAgeIfCanDriveInCountry(10))

    println(scores(Run(10)))
    println(scores(Boundary(50)))
    println(scores(Six(200)))
    println("????")

}

private fun checkAgeIfCanDriveInCountry(age: Int) =
    when {
        (age < 18) -> "Not allowed when under than $age"
        (age == 18) -> {
            "In Bulgaria is allowed when older than $age"
        }

        else -> "Any country"

    }

interface Score
private class Run(val runs: Int) : Score
private class Boundary(val b: Int) : Score
private class Six(val sixes: Int) : Score

private fun scores(score: Score) =
    when (score) {
        is Run -> score.runs
        is Boundary -> score.b * 10
        is Six -> score.sixes + 1000
        else -> throw IllegalArgumentException("?")
    }