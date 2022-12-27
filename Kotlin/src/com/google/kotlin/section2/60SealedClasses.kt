//package com.google.kotlin.section2
//
//sealed class State {
//    class Error(val error: Throwable) : State()
//    class Success(val success: String = "Successfull") : State()
//    object Loading : State()
//}
//
//fun main(args: Array<String>) {
//
//
//
////    val state: State = State.Error(Throwable("Test"))
//    val state: State = State.Success("testtestt")
//    when (state) {
//        State.Loading -> println("Loading")
//        is State.Success -> println(state.success)
//        is State.Error -> println(state.error)
//    }
//
//}
//
//
//
//
//
////sealed class State {
////    class Error : State()
////    class Success : State()
////    class Loading : State()
////}
////
////sealed class Operation() {
////    object Plus: Operation()
////    object Minus: Operation()
////}
////
////sealed class Optional {
////    class Some (val obj:Any): Optional()
////    object None: Optional()
////}