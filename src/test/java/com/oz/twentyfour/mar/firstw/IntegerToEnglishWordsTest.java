package com.oz.twentyfour.mar.firstw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Convert an integer number to its representation using words.
 *
 * Example 1:
 * Input: 123
 * Output: "One Hundred Twenty Three"
 *
 * Example 2:
 * Input: 12_345_678
 * Output: "Twelve Million Three hundred Forty Five Thousand Six Hundred Seventy Eight"
 */
class IntegerToEnglishWordsTest {

  private final IntegerToEnglishWords integerToEnglishWords = new IntegerToEnglishWords();

  @Test
  void hundredsTest() {
    Assertions.assertEquals("One Hundred Twenty Three", this.integerToEnglishWords.numberToWords(123));
    Assertions.assertEquals("Twelve Million Three Hundred Forty Five Thousand Six Hundred Seventy Eight",
        this.integerToEnglishWords.numberToWords(12345678));
  }
}
