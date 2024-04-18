package com.oz.twentyfour.mar.firstw;

public class ValidAnagram {

  public boolean isValid(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    int[] registry = new int[26];
    for (int index = 0; index < s.length(); index++) {
      registry[s.charAt(index) - 'a']++;
    }

    for (int index = 0; index < t.length(); index++) {
      final int counterIndex = t.charAt(index) - 'a';
      registry[counterIndex]--;

      if (registry[counterIndex] < 0) {
        return false;
      }
    }

    return true;
  }

  public boolean isValidWithStream(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    int[] registry = new int[26];

    // Increment counts for characters in string s
    s.chars().forEach(ch -> registry[ch - 'a']++);

    // Decrement counts for characters in string t
    return t.chars().allMatch(ch -> (registry[ch - 'a']-- > 0));
  }
}
