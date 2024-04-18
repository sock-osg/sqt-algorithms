package com.oz.twentyfour.feb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the
 * signed 32-bit integer range [-231, 231 - 1], then return 0.
 * <p>
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
class ReverseIntegerTest {

  private final ReverseInteger reverseInteger = new ReverseInteger();

  @Test
  void reverseZeroTest() {
    int reversed = this.reverseInteger.reverseInteger(0);

    Assertions.assertEquals(0, reversed);
  }

  @Test
  void reverseMaxValueTest() {
    int reversed = this.reverseInteger.reverseInteger(Integer.MAX_VALUE);

    Assertions.assertEquals(0, reversed);
  }

  @Test
  void reversePositiveNumberTest() {
    int reversed = this.reverseInteger.reverseInteger(123456789);

    Assertions.assertEquals(987654321, reversed);
  }

  @Test
  void reverseNegativeNumberTest() {
    int reversed = this.reverseInteger.reverseInteger(-987654321);

    Assertions.assertEquals(-123456789, reversed);
  }
}
