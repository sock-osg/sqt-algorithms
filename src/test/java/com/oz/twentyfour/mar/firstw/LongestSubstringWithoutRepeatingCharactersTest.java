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
    Assertions.assertEquals(2, this.testClass.longestSubstringWithoutRepeatingCharacters("eddy"));
    Assertions.assertEquals(2, this.testClass.longestSubstringWithoutRepeatingCharacters("aaaaaaaaaaaaaaabbbbbbbbbbbbbbbbb"));
    Assertions.assertEquals(8, this.testClass.longestSubstringWithoutRepeatingCharacters("abcdafghi"));
    Assertions.assertEquals(6, this.testClass.longestSubstringWithoutRepeatingCharacters("abcdef"));
    Assertions.assertEquals(1, this.testClass.longestSubstringWithoutRepeatingCharacters("a"));
    Assertions.assertEquals(3, this.testClass.longestSubstringWithoutRepeatingCharacters("abcabcbb"));
    Assertions.assertEquals(1, this.testClass.longestSubstringWithoutRepeatingCharacters("bbbbb"));
    Assertions.assertEquals(3, this.testClass.longestSubstringWithoutRepeatingCharacters("pwwkew"));
    Assertions.assertEquals(16, this.testClass.longestSubstringWithoutRepeatingCharacters("kwlnrwabcdefghijkabc"));
  }

  @Test
  void longestSubstringWithoutRepeatingCharactersTutorVersionTest() {
    Assertions.assertEquals(2, this.testClass.longestSubstringWithoutRepeatingTutorVersion("eddy"));
    Assertions.assertEquals(2, this.testClass.longestSubstringWithoutRepeatingTutorVersion("aaaaaaaaaaaaaaabbbbbbbbbbbbbbbbb"));
    Assertions.assertEquals(8, this.testClass.longestSubstringWithoutRepeatingTutorVersion("abcdafghi"));
    Assertions.assertEquals(6, this.testClass.longestSubstringWithoutRepeatingTutorVersion("abcdef"));
    Assertions.assertEquals(1, this.testClass.longestSubstringWithoutRepeatingTutorVersion("a"));
    Assertions.assertEquals(3, this.testClass.longestSubstringWithoutRepeatingTutorVersion("abcabcbb"));
    Assertions.assertEquals(1, this.testClass.longestSubstringWithoutRepeatingTutorVersion("bbbbb"));
    Assertions.assertEquals(3, this.testClass.longestSubstringWithoutRepeatingTutorVersion("pwwkew"));
    // TODO: Fix the last test
    //Assertions.assertEquals(16, this.testClass.longestSubstringWithoutRepeatingTutorVersion("kwlnrwabcdefghijkabc"));
  }
}
