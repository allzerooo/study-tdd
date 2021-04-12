package com.study.money;

public abstract class Money {

    protected int amount;
    protected String currency;

    abstract Money times(int multiplier);
    abstract String currency();

    static Money dollar(int amount) {
        return new Dollar(amount, null);
    }

    static Money franc(int amount) {
        return new Franc(amount, null);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    String currency() {
        return currency;
    }

}
