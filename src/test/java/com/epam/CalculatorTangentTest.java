package com.epam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTangentTest {

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
      "0.0, 0.0",   // These numbers give failing results, because cos() method in Calculator
                     // was implemented incorrectly
      "0.785398, 1.0",
      "1.570796, 16331239353195370.0" // The same goes for this pair of numbers
  })
  void testTg(double a, double expected) {
    assertEquals(expected, calculator.tg(a), 0.0001);
  }

}
