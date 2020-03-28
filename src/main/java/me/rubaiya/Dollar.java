package me.rubaiya;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multipliers) {
        amount *= multipliers;
    }
}
