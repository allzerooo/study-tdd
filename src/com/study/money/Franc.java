package com.study.money;

public class Franc extends Money {

    Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier, null);
    }
}
