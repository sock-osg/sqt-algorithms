package com.oz.twentyfour.mar.secondw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInRotatedSortedArrayTest {

  private final SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();

  @Test
  void test() {
    final int[] orderedAndRotatedNumbers = new int[] { 6, 7, 8, 9, 0, 1, 2, 3, 4, 5 };

    Assertions.assertEquals(8, this.searchInRotatedSortedArray.apuVersion(4, orderedAndRotatedNumbers));
    Assertions.assertEquals(2, this.searchInRotatedSortedArray.apuVersion(8, orderedAndRotatedNumbers));
    Assertions.assertEquals(-1, this.searchInRotatedSortedArray.apuVersion(12, orderedAndRotatedNumbers));
  }
}
