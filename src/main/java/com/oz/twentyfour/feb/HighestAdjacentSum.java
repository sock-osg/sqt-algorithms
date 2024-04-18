package com.oz.twentyfour.feb;

import java.util.List;
import java.util.stream.IntStream;

public class HighestAdjacentSum {

  public int highestAdjacentSum(final List<Integer> numbers) {
    if (numbers == null || numbers.size() < 2) {
      throw new IllegalArgumentException("List must contain at least two elements");
    }

    int max = numbers.getFirst() + numbers.get(1);

    for (int index = 1; index < numbers.size() - 1; index++) {
      max = Math.max(max, (numbers.get(index) + numbers.get(index + 1)));
    }

    return max;
  }

  public int highestAdjacentSumStream(final List<Integer> numbers) {
    if (numbers == null || numbers.size() < 2) {
      throw new IllegalArgumentException("List must contain at least two elements");
    }

    return IntStream.range(0, numbers.size() - 1)
        .map(index -> numbers.get(index) + numbers.get(index + 1))
        .max()
        .orElseThrow();
  }
}
