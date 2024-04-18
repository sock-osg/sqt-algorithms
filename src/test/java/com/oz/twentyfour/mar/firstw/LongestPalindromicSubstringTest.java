package com.oz.twentyfour.mar.firstw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given a string s, return the longest palindromic substring in s.
 * Example 1:
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer
 *
 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 *
 */
class LongestPalindromicSubstringTest {

  private final LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

  @Test
  void test() {
    Assertions.assertEquals("abcdef123454321fedcba", longestPalindromicSubstring.longestPalindrome("324jabcdef123454321fedcba5jk34babad"));
    Assertions.assertEquals("bab", longestPalindromicSubstring.longestPalindrome("babad"));
    Assertions.assertEquals("bb", longestPalindromicSubstring.longestPalindrome("cbbd"));
  }
}
