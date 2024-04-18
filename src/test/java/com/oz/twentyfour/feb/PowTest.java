package com.oz.twentyfour.feb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Implement pow(x, n), which calculates x raised to the power n (i.e. x^n)
 * <p>
 *   Example 1:
 *    Input: x = 2.00000, n = 10
 *    Output: 1024.00000
 *
 *   Example 2:
 *    Input: x = 2.10000, n = 3
 *    Output: 9.26100
 *
 *   Example 3:
 *    Input: x = 2.00000, n = -2
 *    Output: 0.25000
 *    Explanation: 2⁻² = 1/2² = 1/4 = 0.25
 * </p>
 */
class PowTest {

  private final Pow pow = new Pow();

  @Test
  void positiveIntegerTest() {
    Assertions.assertEquals(33_554_432.00d, pow.pow(2, 25));
    Assertions.assertEquals(1024.00d, pow.pow(2, 10));
  }

  @Test
  void positiveDoubleTest() {
    Assertions.assertEquals(9.261000000000001d, pow.pow(2.1, 3)); // TODO: Why?
  }

  @Test
  void negativePowTest() {
    Assertions.assertEquals(0.25000d, pow.pow(2, -2));
  }
}
