package com.oz.twentyfour.may.secondw;

public class SubstringIndex {

  public int substrIndex(String original, String target) {
    char[] originalChars = original.toCharArray();
    char[] targetChars = target.toCharArray();

    for (int originalStrIndex = 0; originalStrIndex < original.length(); originalStrIndex++) {
      // if first character is equals, then loop over the whole target word
      if (originalChars[originalStrIndex] == targetChars[0]) {
        // loop over target string if and only if original string still have characters.
        int targetStrIndex = 0;
        int charsMatched = 0;
        while ((targetStrIndex + originalStrIndex) < originalChars.length && targetStrIndex < target.length()) {
          if (originalChars[originalStrIndex + targetStrIndex] == targetChars[targetStrIndex]) {
            charsMatched++;
          } else {
            break;
          }
          targetStrIndex++;
        }

        if (charsMatched == target.length()) {
          return originalStrIndex;
        }
      }
    }

    return -1;
  }

  private int[] getLpsArr(String target) {
    int[] lpsArr = new int[target.length()];
    int length = 0;
    int currentIndex = 1;
    while (currentIndex < target.length()) {
      if (target.charAt(currentIndex) == target.charAt(length)) {
        lpsArr[currentIndex++] = ++length;
      } else if (length > 0) {
        length = lpsArr[length - 1];
      } else {
        lpsArr[currentIndex++] = 0;
      }
    }
    return lpsArr;
  }

  // TODO: Analyze this fucking algorithm in depth, I don´t understand it at all.
  int substrIndexTutorVersion(String word, String target) {
    int wordLength = word.length();
    int targetLength = target.length();
    if (targetLength > wordLength) {
      return -1;
    }
    if (targetLength == wordLength) {
      return target.equals(word) ? 0 : -1;
    }
    if (target.isEmpty()) {
      return 0;
    }
    int[] lpsArr = this.getLpsArr(target);
    int maxSubstringLength = 0;
    int currentWordIndex = 0;
    while (currentWordIndex < wordLength && maxSubstringLength < targetLength) {
      if (word.charAt(currentWordIndex) == target.charAt(maxSubstringLength)) {
        currentWordIndex++;
        maxSubstringLength++;
      } else if (maxSubstringLength > 0) {
        maxSubstringLength = lpsArr[maxSubstringLength - 1];
      } else {
        currentWordIndex++;
      }
    }

    return maxSubstringLength < targetLength ? -1 : currentWordIndex - maxSubstringLength;
  }
}
