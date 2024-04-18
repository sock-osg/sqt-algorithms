package com.oz.twentyfour.apr.thirthw;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class FirstRepeatingCharacter {

  public char firstRepeatingChar(String str) {
    if (Objects.isNull(str) || str.isEmpty()) {
      return '\0';
    }

    char[] chars = str.toCharArray();
    Set<Character> set = new HashSet<>();
    for (char currentChar : chars) {
      if (set.contains(currentChar)) {
        return currentChar;
      }

      set.add(currentChar);
    }

    return '\0';
  }
}
