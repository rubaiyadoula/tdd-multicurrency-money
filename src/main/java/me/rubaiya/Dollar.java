package me.rubaiya;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multipliers) {
        return Money.dollar(amount * multipliers);
    }
}
