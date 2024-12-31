import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CalculatorDivideTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun testDivision() {
        assertEquals(2.0, calculator.divide(6, 3), 0.001)
        assertEquals(-2.0, calculator.divide(6, -3), 0.001)
        assertEquals(0.5, calculator.divide(1, 2), 0.001)
    }

    @Test
    fun testDivisionByZero() {
        assertThrows<ArithmeticException> {
            calculator.divide(5, 0)
        }
    }
}
