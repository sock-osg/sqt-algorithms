package com.oz.twentyfour.mar.firstw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search
 * target in nums. If target exists, the return its index. Otherwise, return -1.
 */
class BinarySearchTest {

  private final BinarySearch binarySearch = new BinarySearch();

  @Test
  void binarySearchTest() {
    final int[] orderedNumbers = new int[] {
        1, 2, 3, 4, 5, 6, 7, 8, 11, 13,
        14, 17, 18, 20, 25, 40, 41, 42, 43, 56,
        57, 60, 63, 70, 90, 91, 92, 93, 94, 95,
        96, 97, 98, 99, 100, 200, 1000, 1001, 1002, 1003
    };
    Assertions.assertEquals(8, this.binarySearch.getIndexOf(orderedNumbers, 11));
    Assertions.assertEquals(3, this.binarySearch.getIndexOf(orderedNumbers, 4));
    Assertions.assertEquals(-1, this.binarySearch.getIndexOf(orderedNumbers, 50));
    Assertions.assertEquals(37, this.binarySearch.getIndexOf(orderedNumbers, 1001));
  }

  @Test
  void binarySearchApuVersionTest() {
    final int[] orderedNumbers = new int[] {
        1, 2, 3, 4, 5, 6, 7, 8, 11, 13,
        14, 17, 18, 20, 25, 40, 41, 42, 43, 56,
        57, 60, 63, 70, 90, 91, 92, 93, 94, 95,
        96, 97, 98, 99, 100, 200, 1000, 1001, 1002, 1003
    };
    Assertions.assertEquals(8, this.binarySearch.getIndexOfApuVersion(orderedNumbers, 11));
    Assertions.assertEquals(3, this.binarySearch.getIndexOfApuVersion(orderedNumbers, 4));
    Assertions.assertEquals(-1, this.binarySearch.getIndexOfApuVersion(orderedNumbers, 50));
    Assertions.assertEquals(37, this.binarySearch.getIndexOfApuVersion(orderedNumbers, 1001));
    Assertions.assertEquals(750000, this.binarySearch.getIndexOfApuVersion(IntStream.range(0, 1_000_000_000).toArray(), 750_000));
  }
}
