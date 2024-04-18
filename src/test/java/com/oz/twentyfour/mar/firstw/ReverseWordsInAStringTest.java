package com.oz.twentyfour.mar.firstw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given an input string s. reverse the order of the words.
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * Return a string of the words in reverse order concatenated by a single space.
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should
 * only have a single space separating the words. Do not include any extra spaces.
 *
 * Example 1:
 * Input: s "the sky is blue"
 * Output: "blue is sky the"
 *
 * Example 2:
 * Input: s "   hello world   "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 *
 * Example 3:
 * Input: s = "a good    example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 * Follow-up: If the string data type is mutable in your language, can you solve it in-place with 0(1) extra space?
 */
class ReverseWordsInAStringTest {

  private final ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();

  @Test
  void reverseWordsInAStringTest() {
    Assertions.assertEquals("blue is sky the", this.reverseWordsInAString.reverseWords("the sky is blue"));
    Assertions.assertEquals("world hello", this.reverseWordsInAString.reverseWords("hello world"));
    Assertions.assertEquals("example good a", this.reverseWordsInAString.reverseWords("a good    example"));
  }

  @Test
  void reverseWordsInAStringApuVersionTest() {
    Assertions.assertEquals("blue is sky the", this.reverseWordsInAString.reverseWordsApuVersion("the sky is blue"));
    Assertions.assertEquals("world hello", this.reverseWordsInAString.reverseWordsApuVersion("hello world"));
    Assertions.assertEquals("example good a", this.reverseWordsInAString.reverseWordsApuVersion("a good    example"));
  }
}
