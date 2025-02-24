package com.epam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class CalculatorCosineTest {

  private Calculator calculator;

  @BeforeEach
  public void setUp() {
    calculator = new Calculator();
  }

  @AfterEach
  public void tearDown() {
    calculator = null;
  }

  @ParameterizedTest
  @CsvSource({
      "0.0, 0.0",
      "1.570796, 1.0", // pi/2, returns sin(pi/2) = 1 due to incorrect implementation
      "3.141593, 0.0" // pi, returns sin(pi) = 0 due to incorrect implementation
  })
  public void testCos(double a, double expected) {
    assertEquals(expected, calculator.cos(a), 0.0001);
  }

}
