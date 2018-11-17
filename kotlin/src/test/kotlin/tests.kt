import org.junit.Test
import kotlin.test.assertEquals

class TestSource {

    @Test
    fun f() {
        val cell = Cell(5150)
        assertEquals(5150, cell.foo)
    }

}
