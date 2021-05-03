package com.study.money;

public interface Expression {

    Money reduce(Bank bank, String to);
}
