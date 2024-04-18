package com.oz.twentyfour.feb;

import java.util.stream.IntStream;

public class ReverseString {

  public String reverseSockVersion(final String original) {
    if (original.isBlank()) {
      return original;
    }

    char[] charArray = original.toCharArray();

    int leftIndex = 0;
    int rightIndex = charArray.length - 1;
    while (leftIndex < rightIndex) {
      char tmpLeftChar = charArray[leftIndex];
      charArray[leftIndex] = charArray[rightIndex];
      charArray[rightIndex] = tmpLeftChar;
      leftIndex++;
      rightIndex--;
    }

    return new String(charArray);
  }

  public String reverseGptVersion(String original) {
    if (original.isBlank()) {
      return original;
    }

    char[] charArray = original.toCharArray();

    final int rightIndex = original.length() - 1;
    IntStream.range(0, original.length() / 2)
        .forEach(i -> {
          char tmp = charArray[i];
          charArray[i] = charArray[rightIndex - i];
          charArray[rightIndex - i] = tmp;
        });

    return new String(charArray);
  }
}
