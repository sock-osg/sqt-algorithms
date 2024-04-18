package com.oz.twentyfour.mar.secondw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
 * target.
 * You may assume that each input would have <b>exactly one solution</b>, and may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [ 2, 7, 11, 5 ], target = 9
 * Output: [ 0, 1 ]
 * Example 2:
 * Input: nums = [ 3, 2, 4 ], target = 6
 * Output: [ 1, 2 ]
 * Example 3:
 * Input: nums = [ 3, 3 ], target = 6
 * Output: [ 0, 1 ]
 */
class TwoSumTest {

  private final TwoSum twoSum = new TwoSum();

  @Test
  void apuVersionTest() {
    int[] gotIndexes = this.twoSum.calculate(new int[]{2, 7, 11, 5}, 9);

    Assertions.assertEquals(0, gotIndexes[0]);
    Assertions.assertEquals(1, gotIndexes[1]);
  }

  @Test
  void repeatedNumbersApuVersionTest() {
    int[] gotIndexes = this.twoSum.calculate(new int[]{2, 2, 2, 4, 7, 11, 5}, 9);

    Assertions.assertEquals(2, gotIndexes[0]);
    Assertions.assertEquals(4, gotIndexes[1]);
  }

  @Test
  void repeatedNumbersAndTargetWithRepeatedApuVersionTest() {
    int[] gotIndexes = this.twoSum.calculate(new int[]{1, 2, 2, 4, 7, 11, 5}, 4);

    Assertions.assertEquals(1, gotIndexes[0]);
    Assertions.assertEquals(2, gotIndexes[1]);
  }
}
