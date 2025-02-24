package com.epam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorMultiplicationTest {

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
      "2, 3, 6",
      "0, 100, 0",
      "-2, 3, -6",
      "-3, -3, 9"
  })
  void testMultLong(long a, long b, long expected) {
    assertEquals(expected, calculator.mult(a, b));
  }

  @ParameterizedTest
  @CsvSource({
      "2.5, 2.0, 5.0",
      "3.0, 3.5, 10.0",
      "-2.0, 3.0, -6.0",
      "-3.0, -3.0, 9.0"
  })
  void testMultDouble(double a, double b, double expected) {
    assertEquals(expected, calculator.mult(a, b));
  }

}
