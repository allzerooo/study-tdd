package com.study.money;

// Money 클래스에 times()를 구현할 준비가 되지 않았기 때문에 Money클래스를 추상 클래스로 변경 후 Money.times()를 선언
public abstract class Money {

    protected int amount;

    abstract Money times(int multiplier);

    // 팩토리 메서드
    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

}
