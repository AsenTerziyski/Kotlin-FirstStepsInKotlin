import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun main() {
    val job = coroutineScope {
        delay(1000)
        "Hello"
    }

    val job2 = coroutineScope {
        delay(2000)
        "Coroutine"
    }
    runBlocking {
        println(job)
        println(job2)
    }


}