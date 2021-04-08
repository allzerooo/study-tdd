package com.study.money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);

        /*
            times()는 Dollar를 반환하는데, assertEquals(10, product.amount)는 Dollar를 비교하는 것은 아니기 때문에
            Dollar와 Dollar를 비교하는 코드로 변경. Dollar에 equals를 재정의했기 때문에 가능.
         */
        assertEquals(new Dollar(10), product);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}