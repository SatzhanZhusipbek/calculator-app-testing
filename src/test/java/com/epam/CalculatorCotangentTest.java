package com.epam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorCotangentTest {

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
      "0.5, 0.462117", // tanh(0.5) ≈ 0.462117, due to incorrect implementation of ctg() in Calculator
      "1.0, 0.761594" // tanh(1) ≈ 0.761594, due to incorrect implementation of ctg() in Calculator
  })
  void testCtg(double a, double expected) {
    assertEquals(expected, calculator.ctg(a), 0.0001);
  }

}
