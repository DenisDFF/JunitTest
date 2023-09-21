package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Main {
    public static void main(String[] args) {

    }


}

class SumCalculator {
    public static int sum (int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n має бути невід'ємним числом");
        }
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }
}

class SumCalculatorTest  {
    private SumCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    public void testSumWithN1() {
        int result = calculator.sum(1);
        assertEquals(1, result);
    }

    @Test
    public void testSumWithN3() {
        int result = calculator.sum(3);
        assertEquals(6, result);
    }

    @Test
    public void testSumWithNegativeN() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(-1));
    }
}