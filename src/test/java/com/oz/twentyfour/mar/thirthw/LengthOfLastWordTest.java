package com.oz.twentyfour.mar.thirthw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given a string s consisting of some words separated by some numbers of spaces, return the length of the last word in
 * the string.
 * A word is a maximal substring consisting of non-space characters only.
 */
class LengthOfLastWordTest {

  private final LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

  /**
   * My version is more complex because there are too many validations. Is better the simplest solution proposed by my
   * friend Apu, which uses a counter instead of left and right indices.
   */
  @Test
  void test() {
    Assertions.assertEquals(4, this.lengthOfLastWord.calculate(" the sky  is blue  "));
    Assertions.assertEquals(3, this.lengthOfLastWord.calculate(" blue is  sky the "));
    //Assertions.assertEquals(3, this.lengthOfLastWord.calculate("the"));
  }

  @Test
  void apuVersionTest() {
    Assertions.assertEquals(4, this.lengthOfLastWord.calculateApuVersion(" the sky  is blue  "));
    Assertions.assertEquals(3, this.lengthOfLastWord.calculateApuVersion(" blue is  sky the "));
    Assertions.assertEquals(3, this.lengthOfLastWord.calculateApuVersion("the"));
  }
}
