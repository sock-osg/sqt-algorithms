package com.oz.twentyfour.mar.thirthw;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();

    for (int num : nums) {
      if (!set.add(num)) {
        return true; // If the set already contains the number, it means it's a duplicate.
      }
    }

    return false; // If no duplicates are found, return false.
  }
}
