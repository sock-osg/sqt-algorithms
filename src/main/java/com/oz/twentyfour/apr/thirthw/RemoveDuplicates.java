package com.oz.twentyfour.apr.thirthw;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

  public int[] removeDuplicates(int[] nums) {
    Set<Integer> set = new LinkedHashSet<>();

    for (int num : nums) {
      set.add(num);
    }

    return set.stream().mapToInt(i -> i).toArray();
  }

  public int[] removeDuplicatesUsingStreams(int[] nums) {
    return Arrays.stream(nums).distinct().toArray();
  }
}
