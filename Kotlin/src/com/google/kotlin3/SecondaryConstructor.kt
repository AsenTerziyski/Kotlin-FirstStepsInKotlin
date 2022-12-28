package com.google.kotlin3

fun main() {
    val textBuilder1 = TextBuilder()
    val textBuilder2 = TextBuilder(5000)
    val textBuilder3 = TextBuilder("kiss")

    println(textBuilder1.capacity)
    println(textBuilder2.capacity)
    println(textBuilder3.content)

    println()

    val childBuilder1 = TextBuilder()
    val childBuilder2 = TextBuilder(70000)
    val childBuilder3 = TextBuilder("kiss my ass")

    println(childBuilder1.capacity)
    println(childBuilder2.capacity)
    println(childBuilder3.content)

}

class ChildTextBuilder : TextBuilder {
    constructor() : super()
    constructor(cap: Int) : super(cap)
    constructor(cont: String?) : super(cont)
}

open class TextBuilder {
    var capacity: Int = 0
    var content: String? = null

    constructor() {
        capacity = 100
    }

    constructor(aCapacity: Int) {
        capacity = aCapacity
    }

    constructor(aContent: String?) {
        aContent.let { content = aContent }
    }

}