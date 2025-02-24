package com.epam;

import static org.junit.jupiter.api.Assertions.assertTrue;


import com.epam.tat.module4.Timeout;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TimeoutParallelExecutionTest {

  @BeforeEach
  void setUp() {
    System.out.println(Thread.currentThread().getName() + " - Test started at: " +
        System.currentTimeMillis());
  }

  @AfterEach
  void tearDown() {
    System.out.println(Thread.currentThread().getName() + " - Test finished at: " +
        System.currentTimeMillis());
  }

  @ParameterizedTest
  @CsvSource({
      "1",
      "2",
      "3",
      "4"
  })
  void testParallelTimeouts(int seconds) {
    long startTime = System.currentTimeMillis();
    System.out.println(Thread.currentThread().getName() + " - Sleeping for " + seconds + " seconds.");
    Timeout.sleep(seconds);
    long endTime = System.currentTimeMillis();
    long elapsedSeconds = (endTime - startTime) / 1000;
    assertTrue(elapsedSeconds >= seconds && elapsedSeconds <= seconds + 1,
        "Sleep duration was incorrect");
  }
}
