package com.oz.twentyfour.mar.firstw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

  public int longestSubstringWithoutRepeatingCharacters(String stringChain) {
    if (stringChain.isEmpty()) {
      return 0;
    }

    int maxLength = 0;
    int tmpMaxLength = 0;

    Map<Character, List<Integer>> buffer = new HashMap<>();
    for (int index = 0; index < stringChain.length(); index++) {
      List<Integer> indexes = buffer.getOrDefault(stringChain.charAt(index), new ArrayList<>());
      indexes.add(index);

      if (indexes.size() > 1) { // Found duplicated
        tmpMaxLength = index - indexes.get(indexes.size() - 2);
      } else { // Character found first time
        buffer.put(stringChain.charAt(index), indexes);
        tmpMaxLength++;
      }

      maxLength = Math.max(maxLength, tmpMaxLength);
    }

    return maxLength;
  }

  public int longestSubstringWithoutRepeatingTutorVersion(String str) {
    int maxLength = 0;
    int start = 0;

    int[] indexes = new int[128];
    for (int i = 0; i < 128; i++) {
      indexes[i] = -1;
    }

    for (int i = 0; i < str.length(); i++) {
      if (indexes[str.charAt(i)] >= start) {
        start = indexes[str.charAt(i)] + 1;
      }

      indexes[str.charAt(i)] = i;
      maxLength = Math.max(maxLength, i-start+1);
    }

    return maxLength;
  }
}
