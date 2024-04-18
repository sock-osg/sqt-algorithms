package com.oz.twentyfour.feb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Write a function to find the longest common prefix string amongst an array of strings. if there is no common prefix,
 * return empty string.
 *
 * Input: ["flower", "flow", "flight"]
 * Output: "fl"
 */
class LongestCommonPrefixTest {

  private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

  @Test
  void test() {
    Assertions.assertEquals("fl", this.longestCommonPrefix.longestCommonPrefix(List.of("flower", "flow", "flight")));
    Assertions.assertEquals("a", this.longestCommonPrefix.longestCommonPrefix(List.of("abcd", "accd", "adcd")));
    Assertions.assertEquals("", this.longestCommonPrefix.longestCommonPrefix(List.of("dog", "racecar", "car")));
    Assertions.assertEquals("le", this.longestCommonPrefix.longestCommonPrefix(List.of("leetcode", "lead", "leet")));

  }
}
