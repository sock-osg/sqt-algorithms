package com.oz.twentyfour.may.secondw;

public class LongestPossiblePalindrome {

  public int longestPalindrome(String str) {
    // a = 97, ..... z = 122
    final int[] alphabet = new int[26];

    for (char currentChar : str.toCharArray()) {
      int currentValue = alphabet[currentChar - 97];
      alphabet[currentChar - 97] = currentValue + 1;
    }

    int oddLength = 0;
    int evenLength = 0;
    for (int charCounter : alphabet) {
      if (charCounter % 2 == 0) {
        evenLength += charCounter;
      } else {
        if (oddLength > 0) {
          if (charCounter >= oddLength) {
            oddLength += charCounter - 1;
          }
        } else {
          oddLength = charCounter;
        }
      }
    }

    return evenLength + oddLength;
  }

  public int longestPalindromeTutorVersion(String str){
    int[] occurrences =  new int[26];
    for (char letter : str.toCharArray()) {
      occurrences[letter - 97]++;
    }

    int length = 0;
    for (int occu : occurrences) {
      length += occu % 2 == 0 ? occu : occu - 1;
    }

    // At this point length is ALWAYS an EVEN number. !!!!!!!!
    // Only one character could be in the middle, if current length is lower than str length it means that there is at
    // least one odd character, so is not necessary to calculate odd and even length separately.
    if (length < str.length()) {
      length++;
    }

    return length;
  }
}
