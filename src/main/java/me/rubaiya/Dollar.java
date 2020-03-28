package me.rubaiya;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multipliers) {
        return new Dollar(amount * multipliers);
    }
}
