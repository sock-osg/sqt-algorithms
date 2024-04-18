package com.oz.twentyfour.feb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class RepeatedDnaSequence {

  private static final int SUBSTRING_SIZE = 10;

  public List<String> calculateWithHash(final String dnaSequence) {
    final List<String> result = new ArrayList<>();

    Map<String, Integer> buffer = new HashMap<>();
    for (int leftIndex = 0; (leftIndex + SUBSTRING_SIZE) < (dnaSequence.length() - 1); leftIndex++) {
      final String subString = dnaSequence.substring(leftIndex, SUBSTRING_SIZE + leftIndex);

      if (buffer.containsKey(subString)) {
        buffer.put(subString, buffer.get(subString) + 1);
        result.add(subString);
      } else {
        buffer.put(subString, 1);
      }
    }

    return result;
  }

  public List<String> calculateWithSet(final String dnaSequence) {
    final List<String> result = new ArrayList<>();

    Set<String> buffer = new HashSet<>();
    for (int leftIndex = 0; leftIndex + SUBSTRING_SIZE < dnaSequence.length(); leftIndex++) {
      final String subString = dnaSequence.substring(leftIndex, SUBSTRING_SIZE + leftIndex);

      if (!buffer.add(subString)) {
        result.add(subString);
      }
    }

    return result;
  }

  public List<String> calculateWithSetAndStreams(String dnaSequence) {
    Set<String> buffer = new HashSet<>();

    return IntStream.range(0, dnaSequence.length() - SUBSTRING_SIZE + 1)
        .mapToObj(i -> dnaSequence.substring(i, i + SUBSTRING_SIZE))
        .filter(subString -> !buffer.add(subString))
        .toList();
  }
}
