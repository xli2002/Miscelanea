import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContarLetrasAlexTest {

    @Test
    void devolver() {
        assertAll(
                ()->assertEquals("sdas","sdas"),
                ()->assertEquals("s2323das","sda3232s")
        );
    }
}