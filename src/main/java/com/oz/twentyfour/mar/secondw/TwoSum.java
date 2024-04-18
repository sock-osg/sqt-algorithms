package com.oz.twentyfour.mar.secondw;

import java.util.HashMap;

public class TwoSum {

  public int[] calculate(int[] nums, int target) {
    var map = new HashMap<Integer, Integer>();

    for (int index = 0; index < nums.length; index++) {
      int complement = target - nums[index];
      if (map.containsKey(complement)) {
        return new int[]{ map.get(complement), index };
      } else {
        map.put(nums[index], index);
      }
    }

    throw new IllegalArgumentException("No two sum solution");
  }
}
