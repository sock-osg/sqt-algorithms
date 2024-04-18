package com.oz.twentyfour.mar.thirthw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every
 * element is distinct.
 */
class ContainsDuplicateTest {

  private final ContainsDuplicate containsDuplicate = new ContainsDuplicate();

  @Test
  void iaVersionTest() {
    Assertions.assertFalse(this.containsDuplicate.containsDuplicate(new int[]{ 1, 2, 3, 4 }));
    Assertions.assertTrue(this.containsDuplicate.containsDuplicate(new int[]{ 1, 2, 1, 2, 3, 4 }));
  }
}
