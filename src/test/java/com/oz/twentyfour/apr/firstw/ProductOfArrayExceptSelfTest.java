package com.oz.twentyfour.apr.firstw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements
 * of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 * Example 1:
 * Input: nums = [ 1, 2, 3, 4 ]
 * Output: [ 24, 12, 8, 6 ]
 *
 * Example 2:
 * Input: nums = [ -1, 1, 0, -3 3 ]
 * Output: [ 0, 0, 9, 0, 0 ]
 *
 * Constraints:
 * 2 <= nums.length <= 10⁵
 * -30 <= nums[i] <= 30
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */
class ProductOfArrayExceptSelfTest {

  private final ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

  @Test
  void apuVersionTest() {
    Assertions.assertArrayEquals(
        new int[] { 24, 12, 8, 6 },
        this.productOfArrayExceptSelf.productExceptSelfApuVersion(new int[] { 1, 2, 3, 4 }));
  }
}
