package com.oz.twentyfour.feb;

import java.util.List;

public class LongestCommonPrefix {

  public String longestCommonPrefix(List<String> wordsList) {
    StringBuilder result = new StringBuilder();

    final String wordReference = wordsList.getFirst();
    for (int index = 0; index < wordReference.length(); index++) {
      char currentChar = wordReference.charAt(index);

      for (String word: wordsList) {
        if (word.charAt(index) != currentChar) {
          return result.toString();
        }
      }

      result.append(currentChar);
    }

    return result.toString();
  }
}
