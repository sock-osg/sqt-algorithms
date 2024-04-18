package com.oz.twentyfour.mar.thirthw;

public class LengthOfLastWord {

  public int calculate(String s) {
    int rightIndex = -1;
    for (int index = s.length() - 1; index >= 0 ; index--) {
      if (s.charAt(index) != ' ' && rightIndex == -1) {
        rightIndex = index;
      } else if ((s.charAt(index) == ' ' || index == 0) && rightIndex != -1) {
        return rightIndex - index;
      }
    }

    return -1;
  }

  public int calculateApuVersion(String s) {
    int count = 0;
    // We are looking for the last word so let's go backward
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) != ' ') { // a letter is found so count
        count++;
      } else {  // it's a white space instead
        //  Did we already started to count a word ? Yes so we found the last word
        if (count > 0) return count;
      }
    }
    return count;
  }
}
