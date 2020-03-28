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
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
    }

    @Test
    void dollarEqualityTest() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(6));
        assertNotEquals(new Franc(5), new Dollar(5));
    }
}
