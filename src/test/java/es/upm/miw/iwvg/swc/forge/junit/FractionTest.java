package es.upm.miw.iwvg.swc.forge.junit;

import es.upm.miw.iwvg.swc.forge.junit.Fraction;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(10, 2);
    }

    @Test
    void testFractionDecimal() {
        Assertions.assertEquals(5, fraction.decimal());
    }

    @Test
    void testFractionNumerator() {
        Assertions.assertEquals(10, fraction.getNumerator());
    }

    @Test
    void testFractionDenominator() {
        Assertions.assertEquals(2, fraction.getDenominator());
    }

    @Test
    void whenArithmeticExceptionThrown_thenAssertionSucceeds() {

        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> new Fraction(10, 0).decimal());

        LogManager.getLogger(this.getClass()).debug(exception.getMessage());

    }
}
