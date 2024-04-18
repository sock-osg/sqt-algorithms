package com.oz.twentyfour.mar.secondw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMinimumInRotatedSortedArrayTest {

  private final FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();

  @Test
  void apuVersionTest() {
    Assertions.assertEquals(0, this.findMinimumInRotatedSortedArray.findMinimum(new int[] { 6, 7, 8, 9, 0, 1, 2, 3, 4, 5}));
  }
}
