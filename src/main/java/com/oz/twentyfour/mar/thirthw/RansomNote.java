package com.oz.twentyfour.mar.thirthw;

public class RansomNote {

  public boolean canConstruct(String ransomNote, String magazine) {
    int[] frequency = new int[26];

    for (int index = 0; index < magazine.length(); index++) {
      final int currentCharIndex = magazine.charAt(index) - 'a';
      frequency[currentCharIndex]++;
    }

    for (int index = 0; index < ransomNote.length(); index++) {
      final int currentCharIndex = ransomNote.charAt(index) - 'a';
      if (frequency[currentCharIndex] == 0) {
        return false;
      }
      frequency[currentCharIndex]--;
    }

    return true;
  }

  public boolean canConstructIaVersion(String ransomNote, String magazine) {
    int[] frequency = new int[26];

    magazine.chars().forEach(ch -> frequency[ch - 'a']++);

    return ransomNote.chars().allMatch(ch -> frequency[ch - 'a']-- > 0);
  }
}
