package section3

fun main() {
    val test1 = TextBuilder()
    val test2 = TextBuilder(100)
    val test3 = TextBuilder("Hello Java. Meet real me. My name is Kotlin")

    test1.apply {
        println(this.capacity.toString() + " " + this.content)
    }

    test2.apply {
        println(this.capacity.toString() + " " + this.content)
    }

    test3.apply {
        println(this.capacity.toString() + " " + this.content)
    }

    val test12 = TextBuilderChild()
    val test22 = TextBuilderChild(100)
    val test32 = TextBuilderChild("Hello Java. Meet real me. My name is Kotlin")

    test12.apply {
        println(TextBuilderChild::class.java.simpleName + this.capacity.toString() + " " + this.content)
    }

    test22.apply {
        println(TextBuilderChild::class.java.simpleName + this.capacity.toString() + " " + this.content)
    }

    test32.apply {
        println(TextBuilderChild::class.java.simpleName + this.capacity.toString() + " " + this.content)
    }





}

class TextBuilderChild: TextBuilder {
    constructor(): super()
    constructor(cap: Int): super(cap)
    constructor(cont: String?) : super(cont)
}

open class TextBuilder {
    var capacity: Int = 0
    var content: String? = null

    constructor() {
        capacity = 16
    }

    constructor(aCapacity: Int) {
        capacity = aCapacity
    }

    constructor(aContent: String?) {
        content.let {
            content = aContent
        }
    }
}