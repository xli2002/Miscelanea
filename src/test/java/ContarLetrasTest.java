import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContarLetrasTest {

    @Test
    void esConsonante() {
        assertAll(
                ()->assertEquals("hola","adios"),
                ()->assertEquals("casa","arbol")
        );
    }
}