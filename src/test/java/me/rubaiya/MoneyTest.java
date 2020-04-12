package me.rubaiya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @author Rubaiya Doula
 * @since March 28, 2020
 */

public class MoneyTest {

    @Test
    void dollarMultiplicationTest() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
    }

    @Test
    void dollarEqualityTest() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(6));
        assertNotEquals(Money.franc(5), Money.dollar(5));
    }

    @Test
    void currencyTest() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
