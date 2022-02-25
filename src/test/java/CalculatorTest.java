import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Suma de dos numeros")
    void add() {
        assertEquals(4,Calculator.add(2,2));
        assertTrue(4>Calculator.add(1,2));
    }

    @Test
    void multiply() {
        assertAll(
                ()->assertEquals(4,Calculator.multiply(2,2)),
                ()->assertEquals(-4,Calculator.multiply(2,-2)),
                ()->assertEquals(4,Calculator.multiply(-2,-2)),
                ()->assertEquals(0,Calculator.multiply(2,0))
        );
    }
}