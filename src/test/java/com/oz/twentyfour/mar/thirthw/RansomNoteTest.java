package com.oz.twentyfour.mar.thirthw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RansomNoteTest {

  private final RansomNote ransomNote = new RansomNote();

  @Test
  void test() {
    Assertions.assertTrue(this.ransomNote.canConstruct("food", "abgokwlnfssonkld"));
    Assertions.assertFalse(this.ransomNote.canConstruct("code", "abcdfgh"));
  }

  @Test
  void iaVersionTest() {
    Assertions.assertTrue(this.ransomNote.canConstructIaVersion("food", "abgokwlnfssonkld"));
    Assertions.assertFalse(this.ransomNote.canConstructIaVersion("code", "abcdfgh"));
  }
}
