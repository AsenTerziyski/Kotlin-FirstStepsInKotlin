//package test
//
//import kotlinx.coroutines.*
//import kotlin.system.measureTimeMillis
//
//class Person {
//    val children = GlobalScope.async(start = CoroutineStart.LAZY) { loadChildren() }
//
//    companion object {
//        suspend fun loadChildren(): List<String> {
//            println("Loading children")
//            delay(4000)
//            return listOf("Tom", "Ivan", "Peter")
//        }
//    }
//}
//
//fun main() = runBlocking {
//    println("Creating person")
//    val kevin = Person()
//    kevin.children.start()
//    Thread.sleep(2000)
//    val time = measureTimeMillis {
//        kevin.children.await().forEach{ println(it)}
//    }
//
//    println("Person is created for $time ms")
//    Thread.sleep(2000)
//}