import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CalculatorAddSubtractTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun testAddition() {
        assertEquals(5, calculator.add(2, 3))
        assertEquals(0, calculator.add(-1, 1))
        assertEquals(-10, calculator.add(-7, -3))
    }

    @Test
    fun testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3))
        assertEquals(-2, calculator.subtract(-1, 1))
        assertEquals(-4, calculator.subtract(-7, -3))
    }
}
