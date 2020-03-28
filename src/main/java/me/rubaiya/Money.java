package me.rubaiya;

import java.util.Objects;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;
        Money money = (Money) o;
        return amount == money.amount
                && this.getClass().equals(o.getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
