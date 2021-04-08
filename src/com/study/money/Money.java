package com.study.money;

public abstract class Money {

    protected int amount;

    abstract Money times(int multiplier);

    // 팩토리 메서드
    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

}
