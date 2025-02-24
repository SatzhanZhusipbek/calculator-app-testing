package com.epam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorPowerTest {

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
      "2.0, 3.0, 8.0",
      "5.0, 0.0, 1.0",
      "2.0, -2.0, 0.25"
  })
  void testPow(double a, double b, double expected) {
    assertEquals(expected, calculator.pow(a, b));
  }

}
