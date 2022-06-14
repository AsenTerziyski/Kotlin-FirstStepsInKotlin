package com.google.kotlin.commons

/*
Sealed class is a class which restricts the class hierarchy.
A class can be declared as sealed class using "sealed" keyword
before the class name.
It is used to represent restricted class hierarchy.
Sealed class is used when the object have one of the types
from limited set, but cannot have any other type.
 */

/*
https://www.programiz.com/kotlin-programming/sealed-class
 */
fun main() {
    println(MyConst("Head1", MyConst("Head2", MyConst("Head3", MyNil))))
}

sealed class MyLinkedList<out T : Any>
data class MyConst<out T : Any>(val head: T, val tail: MyLinkedList<T>) : MyLinkedList<T>() {
    override fun toString(): String = "$head -- $tail"

}

// What is Nothing?
/*
Nothing is a type in Kotlin that represents
“a value that never exists”, that means just “no value at all”.
Nothing can be used as the return type of a
function that never returns the code execution — like,
looped forever or always throws Exception.
 */
object MyNil : MyLinkedList<Nothing>() {
    override fun toString(): String = "MyNil"
}
