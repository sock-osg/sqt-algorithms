package com.oz.twentyfour.mar.firstw;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

  public int longestSubstringWithoutRepeatingCharacters(String stringChain) {
    int left = 0;
    int maxLength = 0;

    Set<Character> buffer = new HashSet<>();
    for (int right = 0; right < stringChain.length(); right++) {
      if (!buffer.add(stringChain.charAt(right))) {
        maxLength = Math.max(maxLength, right - left);
        left = right;
      }
    }

    return maxLength;
  }
}
