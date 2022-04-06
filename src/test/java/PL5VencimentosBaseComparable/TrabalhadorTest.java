package PL5VencimentosBaseComparable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabalhadorTest {

    private Trabalhador trab1, trab2, trab3;

    @BeforeEach
    void setUp() {
        trab1 = new TrabalhadorComissao("Paulo Silva", 1000.0f, 3500.0f, 5.30f);
        trab2 = new TrabalhadorHora("Ana Neves", 100, 8.0f);
        trab3 = new TrabalhadorComissao("Antonio Matos", 1000.0f, 3500.0f, 5.30f);
    }

    @Test
    public void testCompareToZero() {
        System.out.println("compareTo");
        int expectedResult = 0;
        int result = trab1.compareTo(trab3);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testCompareToPos() {
        System.out.println("compareTo");
        int expectedResult = 1;
        int result = trab1.compareTo(trab2);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testCompareToNeg() {
        System.out.println("compareTo");
        int expectedResult = -1;
        int result = trab2.compareTo(trab1);
        assertEquals(expectedResult, result);
    }


}