package com.oz.twentyfour.feb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTrailingZeroesTest {

  private final FactorialTrailingZeroes factorialTrailingZeroes = new FactorialTrailingZeroes();

  @Test
  void noZeroesNumberTest() {
    Assertions.assertEquals(0, this.factorialTrailingZeroes.solve(4));
  }

  @Test
  void mediumNumberTest() {
    Assertions.assertEquals(6, this.factorialTrailingZeroes.solve(25));
  }

  @Test
  void largeNumberTest() {
    Assertions.assertEquals(38, this.factorialTrailingZeroes.solve(157));
  }
}
