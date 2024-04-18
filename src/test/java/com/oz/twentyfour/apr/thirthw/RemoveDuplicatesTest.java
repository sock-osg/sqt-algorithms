package com.oz.twentyfour.apr.thirthw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given an array of integers arr, create a function that returns an array containing the values of arr without
 * duplicates (the order doesn't matter).
 *
 * Example 1:
 * Input: arr = [4, 2, 5, 3, 3, 1, 2, 4, 1, 5, 5, 5, 3, 1]
 * Output: [4, 2, 5, 3, 1]
 *
 * Example 2:
 * Input: arr = [1, 1, 1, 1, 1, 1, 1, 1]
 * Output: [1]
 *
 * Example 3:
 * Input: arr = [4, 4, 2, 3, 2, 2, 4, 3]
 * Output: [4, 2, 3]
 */
class RemoveDuplicatesTest {

  private final RemoveDuplicates removeDuplicates = new RemoveDuplicates();

  @Test
  void testRemoveDuplicatesMyVersion() {
    Assertions.assertArrayEquals(new int[]{ 4, 2, 5, 3, 1 }, this.removeDuplicates.removeDuplicates(new int[]{ 4, 2, 5, 3, 3, 1, 2, 4, 1, 5, 5, 5, 3, 1 }));
    Assertions.assertArrayEquals(new int[]{ 1 }, this.removeDuplicates.removeDuplicates(new int[]{ 1, 1, 1, 1, 1, 1, 1, 1 }));
    Assertions.assertArrayEquals(new int[]{ 4, 2, 3 }, this.removeDuplicates.removeDuplicates(new int[]{ 4, 4, 2, 3, 2, 2, 4, 3 }));
  }
}
