package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before(){
        fraction = new Fraction(10, 2);
    }

    @Test
    void testFractionDecimal(){
        Assertions.assertEquals(5, fraction.decimal());
    }
}
