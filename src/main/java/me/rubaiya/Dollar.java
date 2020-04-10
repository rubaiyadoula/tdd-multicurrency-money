package me.rubaiya;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    Money times(int multipliers) {
        return new Dollar(amount * multipliers);
    }
}
