package com.epam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorSumTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
      calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
      calculator = null;
    }

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3",
        "0, 0, 0",
        "-5, 5, 0",
        "100, 200, 300"
    })
    void testSumLong(long a, long b, long expected) {
      assertEquals(expected, calculator.sum(a, b));
    }

    @ParameterizedTest
    @CsvSource({
        "1.5, 2.5, 4.0",
        "0.0, 0.0, 0.0",
        "-5.5, 5.5, 0.0",
        "100.5, 200.5, 301.0"
    })
    void testSumDouble(double a, double b, double expected) {
      assertEquals(expected, calculator.sum(a, b));
    }
}


