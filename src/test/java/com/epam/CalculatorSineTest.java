package com.epam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorSineTest {

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
      "0.0, 0.0",
      "1.570796, 1.0", // pi/2, sin(pi/2) = 1
      "3.141593, 0.0" // pi, sin(pi) = 0
  })
  void testSin(double a, double expected) {
    assertEquals(expected, calculator.sin(a), 0.0001);
  }

}
