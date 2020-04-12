package me.rubaiya;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    protected String currency() {
        return "USD";
    }

    public Money times(int multipliers) {
        return new Dollar(amount * multipliers);
    }
}
