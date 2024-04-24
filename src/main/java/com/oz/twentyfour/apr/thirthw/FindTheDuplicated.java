package com.oz.twentyfour.apr.thirthw;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicated {
  public int findTheDuplicated(int[] numbers) {
    Set<Integer> set = new HashSet<>();

    for (int anInt : numbers) {
      if (!set.add(anInt)) {
        return anInt;
      }
    }

    return -1;
  }
}
