package com.oz.twentyfour.apr.thirthw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given a string str, create a function that returns the first repeating character. If such character doesn't exist,
 * return the null character '\0'.
 *
 * Example 1:
 * Input: str = "inside code"
 * Output: 'i'
 *
 * Example 2:
 * Input: str = "programming"
 * Output: 'r'
 *
 * Example 3:
 * Input: str = "abcd"
 * Output: '\0'
 *
 * Example 4:
 * Input: str = "abba"
 * Output: 'b'
 */
class FirstRepeatingCharacterTest {
  
  private final FirstRepeatingCharacter firstRepeatingCharacter = new FirstRepeatingCharacter();
  
  @Test
  void firstRepeatingCharacterSuccessfullTest() {
    Assertions.assertEquals('\0', this.firstRepeatingCharacter.firstRepeatingChar(null));
    Assertions.assertEquals('\0', this.firstRepeatingCharacter.firstRepeatingChar(""));
    Assertions.assertEquals('i', this.firstRepeatingCharacter.firstRepeatingChar("inside code"));
    Assertions.assertEquals('r', this.firstRepeatingCharacter.firstRepeatingChar("programming"));
    Assertions.assertEquals('\0', this.firstRepeatingCharacter.firstRepeatingChar("abcd"));
    Assertions.assertEquals('b', this.firstRepeatingCharacter.firstRepeatingChar("abba"));
  }
}
