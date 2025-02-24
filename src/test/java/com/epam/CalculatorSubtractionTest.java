package com.epam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorSubtractionTest {

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
      "5, 3, 2",
      "10, 10, 0",
      "0, 5, -5",
      "-10, -5, -5"
  })
  void testSubLong(long a, long b, long expected) {
    assertEquals(expected, calculator.sub(a, b));
  }

  @ParameterizedTest
  @CsvSource({
      "5.5, 3.3, 2.2",
      "10.0, 10.0, 0.0",
      "0.0, 5.5, -5.5",
      "-10.5, -5.5, -5.0"
  })
  void testSubDouble(double a, double b, double expected) {
    assertEquals(expected, calculator.sub(a, b));
  }

}
