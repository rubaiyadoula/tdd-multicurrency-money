package me.rubaiya;

import java.util.Objects;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multipliers) {
        return new Dollar(amount * multipliers);
    }
}
