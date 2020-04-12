package me.rubaiya;

public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }

    @Override
    protected String currency() {
        return "CHF";
    }

    @Override
    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
