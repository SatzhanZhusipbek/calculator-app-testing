package com.epam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorDivisionTest {

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
      "6, 3, 2",
      "10, 2, 5",
      "-10, 5, -2"
  })
  void testDivLong(long a, long b, long expected) {
    assertEquals(expected, calculator.div(a, b));
  }

  @ParameterizedTest
  @CsvSource({
      "6.0, 3.0, 2.0",
      "10.5, 2.0, 5.25",
      "-10.0, 5.0, -2.0"
  })
  void testDivDouble(double a, double b, double expected) {
    assertEquals(expected, calculator.div(a, b));
  }

  @Test
  void testDivByZeroLong() {
    assertThrows(NumberFormatException.class, () -> calculator.div(1L, 0L));
  }

}
