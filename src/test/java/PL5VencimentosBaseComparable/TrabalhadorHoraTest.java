package PL5VencimentosBaseComparable;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabalhadorHoraTest {

    private TrabalhadorHora trab2;

    @BeforeEach
    public void setUp() {
        trab2 = new TrabalhadorHora("Ana Neves", 100, 8.0f);
    }


    @Test
    public void testCalcularVencimento() {
        System.out.println("calcularVencimento");
        float expResult = 800.0f;
        float result = trab2.calcularVencimento();
        assertEquals(expResult, result, 0.005);
    }

}