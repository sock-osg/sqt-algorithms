package com.oz.twentyfour.may.secondw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given two strings str1 and str2, create a function that returns the first index where we can find str2 in str1. If we
 * cannot find str2 in str1, the function must return -1.
 * Try to solve the problem without using the built-in .indexOf() method.
 *
 * Example 1:
 * Input: str1 = "inside", str2 = "side"
 * Output: 2
 * Explanation: we can find "side" in "inside" by starting from the index 2
 *
 * Example 2:
 * Input: str1 = "inside", str2 = "in"
 * Output: 0
 * Explanation: we can find "in" in "inside" by starting from the index 0
 *
 * Example 3:
 * Input: str1 = "inside", str2 = "code"
 * Output: -1
 * Explanation: we can't find "code" in "inside"
 */
class SubstringIndexTest {

  private final SubstringIndex substringIndex = new SubstringIndex();

  @Test
  void substrIndexTest() {
    Assertions.assertEquals(7, this.substringIndex.substrIndex("bbaaaabbbba", "bbba"));
    Assertions.assertEquals(3, this.substringIndex.substrIndex("bababbba", "abb"));
    Assertions.assertEquals(2, this.substringIndex.substrIndex("inside", "side"));
    Assertions.assertEquals(0, this.substringIndex.substrIndex("inside", "in"));
    Assertions.assertEquals(-1, this.substringIndex.substrIndex("inside", "code"));
  }

  @Test
  void substrIndexTutorVersionTest() {
    Assertions.assertEquals(7, this.substringIndex.substrIndexTutorVersion("bbaaaabbbba", "bbba"));
    /*Assertions.assertEquals(3, this.substringIndex.substrIndexTutorVersion("bababbba", "abb"));
    Assertions.assertEquals(2, this.substringIndex.substrIndexTutorVersion("inside", "side"));
    Assertions.assertEquals(0, this.substringIndex.substrIndexTutorVersion("inside", "in"));
    Assertions.assertEquals(-1, this.substringIndex.substrIndexTutorVersion("inside", "code"));*/
  }
}
