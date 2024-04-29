package com.oz.twentyfour.apr.fourthw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given a non-empty array of integers arr, create a function that returns the sum of the subarray that has the greatest sum.
 * We don't consider the empty array [] as a subarray.
 * <p>
 * Example 1:
 * Input: arr = [2, 3, -6, 4, 2, -8, 3]
 * Output: 6
 * Explanation: the maximum subarray is [4, 2], its sum is 6
 * <p>
 * Example 2:
 * Input: arr = [2, 3, -1, 4, -10, 2, 5]
 * Output: 8
 * Explanation: the maximum subarray is [2, 3, -1, 4], its sum is 8
 * <p>
 * Example 3:
 * Input: arr = [-3, -1, -2]
 * Output: -1
 * Explanation: the maximum subarray is [-1], its sum is -1
 */
class MaximumSubarrayTest {

  private final MaximumSubarray maximumSubarray = new MaximumSubarray();

  @Test
  void maximumSubarrayTest() {
    Assertions.assertEquals(6, maximumSubarray.maximumSubarray(new int[]{2, 3, -6, 4, 2, -8, 3}));
    Assertions.assertEquals(8, maximumSubarray.maximumSubarray(new int[]{2, 3, -1, 4, -10, 2, 5}));
    Assertions.assertEquals(-1, maximumSubarray.maximumSubarray(new int[]{-3, -1, -2}));
    Assertions.assertEquals(0, maximumSubarray.maximumSubarray(new int[]{0}));
    Assertions.assertEquals(10, maximumSubarray.maximumSubarray(new int[]{1, 2, 3, 4}));
  }

  @Test
  void maximumSubarrayTutorVersionTest() {
    Assertions.assertEquals(6, maximumSubarray.maximumSubarrayTutorVersion(new int[]{2, 3, -6, 4, 2, -8, 3}));
    Assertions.assertEquals(8, maximumSubarray.maximumSubarrayTutorVersion(new int[]{2, 3, -1, 4, -10, 2, 5}));
    Assertions.assertEquals(-1, maximumSubarray.maximumSubarrayTutorVersion(new int[]{-3, -1, -2}));
    Assertions.assertEquals(0, maximumSubarray.maximumSubarrayTutorVersion(new int[]{0}));
    Assertions.assertEquals(10, maximumSubarray.maximumSubarrayTutorVersion(new int[]{1, 2, 3, 4}));
  }
}
