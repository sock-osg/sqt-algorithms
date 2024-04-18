package com.oz.twentyfour.mar.firstw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * Example 1
 * Input: "abcabcbb"
 * Output: 3 ("abc")
 *
 * Example 2
 * Input: "bbbbb"
 * Output: 1 ("b")
 *
 * Example 3
 * Input: "pwwkew"
 * Output: 3 ("wke")
 */
class LongestSubstringWithoutRepeatingCharactersTest {

  private final LongestSubstringWithoutRepeatingCharacters testClass = new LongestSubstringWithoutRepeatingCharacters();

  @Test
  void longestSubstringWithoutRepeatingCharactersTest() {
    Assertions.assertEquals(3, this.testClass.longestSubstringWithoutRepeatingCharacters("abcabcbb"));
    Assertions.assertEquals(1, this.testClass.longestSubstringWithoutRepeatingCharacters("bbbbb"));
    Assertions.assertEquals(3, this.testClass.longestSubstringWithoutRepeatingCharacters("pwwkew"));
    Assertions.assertEquals(11, this.testClass.longestSubstringWithoutRepeatingCharacters("kwlnrwabcdefghijkabc"));
  }
}
