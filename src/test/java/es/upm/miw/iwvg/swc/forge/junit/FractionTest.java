package es.upm.miw.iwvg.swc.forge.junit;

import es.upm.miw.iwvg.swc.forge.junit.Fraction;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FractionTest {

    private Fraction fraction, fractionNoEquivalent, propiaFraction;

    private Fraction fraction2;
    @BeforeEach
    void before() {
        fraction = new Fraction(10, 2);
        fractionNoEquivalent = new Fraction(5, 5);
        propiaFraction = new Fraction(2,5);
        fraction2 = new Fraction(2,10);
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
    void testIsEquivalent() {
        Assertions.assertEquals(true, fraction.isEquivalent(fraction));
        Assertions.assertEquals(false, fraction.isEquivalent(fractionNoEquivalent));
    }

    @Test
    void testIsPropia(){

        Assertions.assertEquals(false,fraction.isPropia());


        Assertions.assertEquals(true,fraction2.isPropia());
    }


    @Test
    void whenArithmeticExceptionThrown_thenAssertionSucceeds() {

        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> new Fraction(10, 0).decimal());

        LogManager.getLogger(this.getClass()).debug(exception.getMessage());

    }

    @Test
    void testIsImpropia(){
        Assertions.assertEquals(true, this.fraction.isImpropia());
        Assertions.assertEquals(false, this.propiaFraction.isImpropia());
    }
}
