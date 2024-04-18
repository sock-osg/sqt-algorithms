package com.oz.twentyfour.feb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class HighestAdjacentSumTest {

  private final HighestAdjacentSum highestAdjacentSum = new HighestAdjacentSum();

  @Test
  void nullListTest() {
    Assertions.assertThrowsExactly(
        IllegalArgumentException.class, () -> this.highestAdjacentSum.highestAdjacentSum(null));
  }

  @Test
  void listLessThanTwoElementsTest() {
    Assertions.assertThrowsExactly(
        IllegalArgumentException.class, () -> this.highestAdjacentSum.highestAdjacentSum(List.of(1)));
  }

  @Test
  void test() {
    int max = this.highestAdjacentSum.highestAdjacentSum(List.of(9, 5, 1, 3, 8, 2, 8, 7, 4));

    Assertions.assertEquals(15, max);
  }

  @Test
  void streamTest() {
    int max = this.highestAdjacentSum.highestAdjacentSumStream(List.of(9, 5, 1, 3, 8, 2, 8, 7, 4));

    Assertions.assertEquals(15, max);
  }
}
