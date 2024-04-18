package com.oz.twentyfour.mar.firstw;

public class ReverseWordsInAString {

  public String reverseWords(String theSkyIsBlue) {
    String[] split = theSkyIsBlue.split("\\s+");

    for (int index = 0; index < split.length / 2; index++) {
      final int outIndex = (split.length - 1) - index;
      final String aux = split[index];
      split[index] = split[outIndex];
      split[outIndex] = aux;
    }

    return String.join(" ", split);
  }

  public String reverseWordsApuVersion(String s) {
    char[] str = s.toCharArray();
    // step 1: reverse the entire string
    reverse(str, 0, str.length - 1);
    // step 2: reverse each words
    reverseWords(str);
    // step 3: clean spaces
    return cleanSpaces(str);
  }

  private String cleanSpaces(char[] str) {
    int left = 0;
    int right = 0;
    while (right < str.length) {
      while (right < str.length && str[right] == ' ') right++;
      while (right < str.length && str[right] != ' ') {
        str[left] = str[right];
        left++;
        right++;
      }
      while (right < str.length && str[right] == ' ') right++;
      if (right < str.length) {
        str[left] = ' ';
        left++;
      }
    } // 0 to left - 1
    return new String(str).substring(0, left);
  }

  private void reverseWords(char[] str) {
    int left = 0;
    int right = 0;
    while (left < str.length) {
      while (left < str.length && str[left] == ' ') left++;
      right = left;
      while (right < str.length && str[right] != ' ') right++;
      reverse(str, left, right - 1);
      left = right;
    }
  }

  private void reverse(char[] str, int left, int right) {
    while (left < right) {
      char tmp = str[left];
      str[left] = str[right];
      str[right] = tmp;
      left++;
      right--;
    }
  }
}
