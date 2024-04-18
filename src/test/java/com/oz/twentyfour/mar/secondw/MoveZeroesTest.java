package com.oz.twentyfour.mar.secondw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non zeroes
 * elements.
 * <b>Note</b> that you must do this in-place without making a copy of the array.
 *
 * Example 1:
 * Input: nums = [ 0, 1, 0, 3, 12 ]
 * Output: [ 1, 3, 12, 0, 0 ]
 *
 * Example 2:
 * Input: nums = [ 0 ]
 * Output: [ 0 ]
 */
class MoveZeroesTest {

  private final MoveZeroes moveZeroes = new MoveZeroes();

  @Test
  void test() {
    Assertions.assertArrayEquals(new int[] { 1, 3, 12, 0, 0 }, this.moveZeroes.moveZeroes(new int[] { 0, 1, 0, 3, 12 }));
    Assertions.assertArrayEquals(new int[] { 85, 9, 32, 10, 2, 5, 23, 1, 10, 0, 0, 0, 0 }, this.moveZeroes.moveZeroes(new int[] { 85, 9, 32, 0, 10, 0, 0, 2, 5, 23, 0, 1, 10 }));
  }

  @Test
  void apuVersionTest() {
    Assertions.assertArrayEquals(new int[] { 1, 3, 12, 0, 0 }, this.moveZeroes.moveZeroes(new int[] { 0, 1, 0, 3, 12 }));
    Assertions.assertArrayEquals(new int[] { 85, 9, 32, 10, 2, 5, 23, 1, 10, 0, 0, 0, 0 }, this.moveZeroes.moveZeroesApuVersion(new int[] { 85, 9, 32, 0, 10, 0, 0, 2, 5, 23, 0, 1, 10 }));
  }
}
