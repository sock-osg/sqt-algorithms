package com.oz.twentyfour.mar.thirthw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
class RotateArrayTest {

  private final RotateArray rotateArray = new RotateArray();

  @Test
  void apuVersionTest() {
    Assertions.assertArrayEquals(new int[]{ 2, 3, 4, 5, 6, 7, 1 }, this.rotateArray.rotateApuVersion(new int[]{ 1, 2, 3, 4, 5, 6, 7 }, 6));
    Assertions.assertArrayEquals(new int[]{ 4, 5, 1, 2, 3 }, this.rotateArray.rotateApuVersion(new int[]{ 1, 2, 3, 4, 5 }, 2));
    Assertions.assertArrayEquals(new int[]{ 5, 1, 2, 3, 4 }, this.rotateArray.rotateApuVersion(new int[]{ 1, 2, 3, 4, 5 }, 11));
  }
}
