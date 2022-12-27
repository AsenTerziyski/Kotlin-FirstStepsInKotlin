//package com.google.kotlin.section2
//
//fun main() {
//    val s: State = State.Loading
//    val t: Throwable = Throwable("Test throwable")
//    val s2: State = State.Error(t)
////    when (s) {
////        is State.Success -> println(s.result)
////        is State.Error -> println(s.error)
////        State.Loading -> println("Loading...")
////    }
//    processState(s)
//    processState(s2)
//}
//
//sealed class State {
//    object Loading : State()
//    class Success(val result: String) : State()
//    class Error(val error: Throwable) : State()
//}
//
//fun processState(s:State) = when(s) {
//    is State.Success -> println(s.result)
//    is State.Error -> println(s.error)
//    is State.Loading -> println("Loading...")
//}
//
