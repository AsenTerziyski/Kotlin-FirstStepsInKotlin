package com.google.kotlin.section2

fun main(args: Array<String>) {
    println(b())
    println(b()("Hello"))
    println(b().invoke("Hello"))

}

fun a(b: (String, String) -> Int) : Int {
    return b("","")
}

fun b(): (String) -> Int {
    return {s->s.length}
}



