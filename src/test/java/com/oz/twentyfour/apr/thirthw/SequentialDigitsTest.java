package com.oz.twentyfour.apr.thirthw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/***
 * An integer has sequential digits if and only if each digit in the numbers is one more that the previous digit. Return
 * a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.
 *
 * Example 1:
 * low: 100
 * High: 200
 * Output: [ 123, 234 ]
 *
 * Example 2:
 * low: 1000
 * High: 13_000
 * Output: [ 1234, 2345, 3456, 4567, 5678, 6789, 123545 ]
 */
class SequentialDigitsTest {

  private final SequentialDigits sequentialDigits = new SequentialDigits();

  @Test
  void apuVersionTest() {
    final List<Integer> firstTest = this.sequentialDigits.sequentialDigitsApuVersion(100, 300);
    Assertions.assertEquals(2, firstTest.size());
    Assertions.assertEquals(123, firstTest.getFirst());
    Assertions.assertEquals(234, firstTest.getLast());

    final List<Integer> secondTest = this.sequentialDigits.sequentialDigitsApuVersion(1_000, 13_000);
    Assertions.assertEquals(7, secondTest.size());
    Assertions.assertEquals(1234, secondTest.getFirst());
    Assertions.assertEquals(12_345, secondTest.getLast());
  }
}
