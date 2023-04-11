import kotlinx.coroutines.runBlocking
import org.junit.Test
import test.doWork
import kotlin.test.assertEquals

class _05_Test_SimpleTest {
    private val a = 5
    val b = 7
    val sum = a + b

    @Test
    fun firstTest() {
        val a = 5
        val b = 7
        assertEquals(12, sum)
    }

    @Test
    fun secondTest() {
        assertEquals(100, sum)
    }

    @Test
    fun thirdTest() = runBlocking {
        val result = doWork()
        assertEquals("Test", result)
    }

    @Test
    fun forthTest() = runBlocking {
        assertEquals("TeSt", doWork())
    }

}