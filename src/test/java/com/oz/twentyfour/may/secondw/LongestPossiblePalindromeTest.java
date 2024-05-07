package com.oz.twentyfour.may.secondw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given a string str made of alphabetical letters only, create a function that returns the length of the longest
 * palindrome string that can be made from letters of str.
 *
 * Example 1:
 * Input: str = "abbaba"
 * Output: 5
 * Explanation: one of the longest palindromes that can be made is "baaab", its length is 5
 *
 * Example 2:
 * Input: str = "abbaaa"
 * Output: 6
 * Explanation: one of the longest palindromes that can be made is "baaaab", its length is 6
 *
 * Example 3:
 * Input: str = "abbabab"
 * Output: 7
 * Explanation: one of the longest palindromes that can be made is "bbaaabb", its length is 7
 *
 * Example 4:
 * Input: str = "abdccdceeebebc"
 * Output: 13
 * Explanation: one of the longest palindromes that can be made is "eedccbabccdee", its length is 13
 */
class LongestPossiblePalindromeTest {

  private final LongestPossiblePalindrome longestPossiblePalindrome = new LongestPossiblePalindrome();

  @Test
  void longestPalindromeTest() {
    Assertions.assertEquals(5, this.longestPossiblePalindrome.longestPalindrome("abbaba"));
    Assertions.assertEquals(6, this.longestPossiblePalindrome.longestPalindrome("abbaaa"));
    Assertions.assertEquals(7, this.longestPossiblePalindrome.longestPalindrome("abbabab"));
    Assertions.assertEquals(13, this.longestPossiblePalindrome.longestPalindrome("abdccdceeebebc"));
  }

  @Test
  void longestPalindromeTutorVersionTest() {
    Assertions.assertEquals(5, this.longestPossiblePalindrome.longestPalindromeTutorVersion("abbaba"));
    Assertions.assertEquals(6, this.longestPossiblePalindrome.longestPalindromeTutorVersion("abbaaa"));
    Assertions.assertEquals(7, this.longestPossiblePalindrome.longestPalindromeTutorVersion("abbabab"));
    Assertions.assertEquals(13, this.longestPossiblePalindrome.longestPalindromeTutorVersion("abdccdceeebebc"));
  }
}
