package com.oz.twentyfour.apr.thirthw;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

  /*
   * Solution 3:
   *
   * We put n = length of arr
   *
   * Time complexity: O(n)
   *
   * Explanation:
   *
   * Inserting an element in a hash table costs O(1) in average, and we are doing it for each element
   * We also have the cost of converting the keys of the hash table into an array, which is n
   *
   * T(n) = n+n = 2n = O(n)
   *
   * Space complexity: O(n)
   *
   * Explanation:
   *
   * The hash table can contain n elements in the worst case, when there are no duplicates, so:
   *
   * S(n) = O(n)
   */
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
