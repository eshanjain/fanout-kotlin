import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CalculatorMultiplyTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3))
        assertEquals(-2, calculator.multiply(2, -1))
        assertEquals(0, calculator.multiply(0, 5))
        assertEquals(20, calculator.multiply(4, 5))
    }
}
