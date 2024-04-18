package com.oz.twentyfour.feb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Write a function that takes as its input a string and returns an array of arrays as shown below sorted in descending
 * order by frequency and then by ascending by character. The function should:
 * <ul>
 *   <li>take a string as input</li>
 *   <li>count the frequency of each character in the string</li>
 *   <li>return an array of sub-arrays where each subarray contains the characters and its frequency</li>
 *   <li>sort the array in descending order by frequency and ascending order by character</li>
 * </ul>
 *
 * <p>
 *   Example 1:
 *   Input: "mississippi"
 *   Output: [ ['i', 4], ['s', 4], ['p', 2], ['m', 1] ]
 * </p>
 * <p>
 *   Example 2:
 *   Input: "mmmaaaiiibbb"
 *   Output: [ ['a', 3], ['b', 3], ['i', 3], ['m', 3] ]
 * </p>
 * <p>
 *   Example 3:
 *   Input: "miaaiaaippi"
 *   Output: [ ['a', 4], ['i', 4], ['p', 2], ['m', 1] ]
 * </p>
 */
class CharacterFrequencyTest {

  private final CharacterFrequency characterFrequency = new CharacterFrequency();

  @Test
  void test() {
    List<List<Character>> output = this.characterFrequency.calculate("mississippi");
    Assertions.assertEquals('i', output.get(0).get(0));
    Assertions.assertEquals('4', output.get(0).get(1));
    Assertions.assertEquals('s', output.get(1).get(0));
    Assertions.assertEquals('4', output.get(1).get(1));
    Assertions.assertEquals('p', output.get(2).get(0));
    Assertions.assertEquals('2', output.get(2).get(1));
    Assertions.assertEquals('m', output.get(3).get(0));
    Assertions.assertEquals('1', output.get(3).get(1));
  }
}
