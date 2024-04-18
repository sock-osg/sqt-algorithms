package com.oz.twentyfour.feb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Write the best approach to sum last N numbers for a given list of numbers, the list starts empty and is possible to
 * add new elements using {@code add} method. N can´t be updated. This will be used in a single thread environment and
 * one instance per process.
 */
class SumLastElementsInListTest {

  private final SumLastElementsInList sumLastElementsInList = new SumLastElementsInList(3);

  @Test
  void test() {
    this.sumLastElementsInList.add(100);
    Assertions.assertEquals(100, this.sumLastElementsInList.calculate());

    for (int currentInt : List.of(8, 2, 9, 5, 4, 8, 3)) {
      this.sumLastElementsInList.add(currentInt);
    }
    Assertions.assertEquals(15, this.sumLastElementsInList.calculate());

    this.sumLastElementsInList.add(19);
    Assertions.assertEquals(30, this.sumLastElementsInList.calculate());
  }
}
