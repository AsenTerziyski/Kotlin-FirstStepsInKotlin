package com.google.kotlin.commons.classes

fun main() {
// FIRST
//    val const = Const(5)
//    println(const.vl)

//    val sum = Sum(Const(3), Const(7))
//    println(eval(const))
//    println(eval(sum))

// SECOND
    val const = ConstClazz(7)
    println(const.clazzValue)
    val sumClazz = SumClazz(ConstClazz(1), ConstClazz(2))
    println(myEval(sumClazz))
}

sealed class ExprClazz
class ConstClazz(val clazzValue: Int) : ExprClazz()
class SumClazz(val rightClazzValue: ExprClazz, val leftClazzValue: ExprClazz) : ExprClazz()
object NotANumber : ExprClazz()

fun myEval(me: ExprClazz): Int = when (me) {
    is ConstClazz -> me.clazzValue
    is SumClazz -> myEval(me.leftClazzValue) + myEval(me.rightClazzValue)
    NotANumber -> throw Exception("!")
}

// FIRST
// 01
//open class Expr

// 02 -> class Const inherits Expr:
//class Const(val vl: Int): Expr()

// 03 -> class Sum inherits Expr:
//class Sum(val left:Expr, val right: Expr): Expr()

//fun eval(e:Expr): Int {
//    return when(e) {
//        is Const -> e.vl
//        is Sum -> eval(e.left) + eval(e.right)
//        else -> throw IllegalArgumentException("Unknown expression")
//    }
//}