import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiscelaneaTest {

    @Test
    void suma() {
        assertEquals(73,Miscelanea.suma(43,30));
    }

    @Test
    void generaAleatorioEntre() {
        assertEquals(Math.floor(Math.random() * (7 - 11) + 11) , Miscelanea.generaAleatorioEntre(7,11));
    }

    @Test
    void concatena() {
        assertEquals("gatopardo",Miscelanea.concatena("gato","pardo"));
    }

    @Test
    void getMayor() {
        assertEquals(true,Miscelanea.getMayor(7,11));
    }

    @Test
    void getMaximo() {
        assertEquals(13,Miscelanea.getMaximo(new int[]{8,9,1,10,3,13}));

    }

    @Test
    void getElemento() {
        assertEquals(3,Miscelanea.getElemento(new int[]{8,9,1,10,3,13},4));
    }

    @Test
    void factorial() {
        assertEquals(24,Miscelanea.factorial(4));
    }

    @Test
    void esPrimo() {
        assertEquals(false,Miscelanea.esPrimo(12));
        assertEquals(true,Miscelanea.esPrimo(13));

    }

    @Test
    void areaCirculo() {
        assertEquals((Math.pow(4,2)*Math.PI),Miscelanea.areaCirculo(4));

    }

    @Test
    void areaTriangulo() {
        assertEquals(14/3,Miscelanea.areaTriangulo(4,7));
    }

    @Test
    void areaCuadrado() {
        assertEquals(16,Miscelanea.areaCuadrado(4));
    }

    @Test
    void decimalABinario() {
        assertEquals(1101,Miscelanea.decimalABinario(13));
    }
}