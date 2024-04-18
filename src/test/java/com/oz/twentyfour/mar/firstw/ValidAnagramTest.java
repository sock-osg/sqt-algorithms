package com.oz.twentyfour.mar.firstw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given two strings s and t, write a function to determinate if s is an anagram of t.
 *
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all
 * the original letters exactly once.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "aaab", t = "ccca"
 * Output: false
 */
class ValidAnagramTest {

  private final ValidAnagram validAnagram = new ValidAnagram();

  @Test
  void isValidTest() {
    Assertions.assertTrue(this.validAnagram.isValid("anagram", "nagaram"));
  }

  @Test
  void isValidWithStreamsTest() {
    Assertions.assertTrue(this.validAnagram.isValidWithStream("anagram", "nagaram"));
  }
}
