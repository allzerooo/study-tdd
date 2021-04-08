package com.study.money;

public class Dollar {

    // amount를 쓰는 코드는 Dollar 자신뿐이라 private으로 변경
    private int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
