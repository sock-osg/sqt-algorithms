package com.oz.twentyfour.feb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * All DNA is composed of a series of nucleotides abbreviated as 'A', 'C', 'G' and 'T', for example: "ACGAATTCCG". When
 * studying DNA, it is sometimes useful to identify repeated sequences within the DNA.
 *
 * Write a function to find all the 10-letter-long sequences(substrings) that occur more than once in a DNA molecule.
 *
 * Example 1:
 * Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
 * Output: [ "AAAAACCCCC", "CCCCCAAAAA" ]
 *
 * Example 2:
 * Input: s = "AAAAAAAAAAAAA"
 * Output: [ "AAAAAAAAAA" ]
 */
class RepeatedDnaSequenceTest {

  private final RepeatedDnaSequence repeatedDnaSequence = new RepeatedDnaSequence();

  @Test
  void calculateWithMapTest() {
    List<String> sequences = this.repeatedDnaSequence.calculateWithHash("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");

    Assertions.assertEquals(2, sequences.size());
    Assertions.assertEquals("AAAAACCCCC", sequences.get(0));
    Assertions.assertEquals("CCCCCAAAAA", sequences.get(1));
  }

  @Test
  void calculateWithSetTest() {
    List<String> sequences = this.repeatedDnaSequence.calculateWithSet("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");

    Assertions.assertEquals(2, sequences.size());
    Assertions.assertEquals("AAAAACCCCC", sequences.get(0));
    Assertions.assertEquals("CCCCCAAAAA", sequences.get(1));
  }

  @Test
  void calculateWithSetAndStreamsTest() {
    List<String> sequences = this.repeatedDnaSequence.calculateWithSetAndStreams("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");

    Assertions.assertEquals(2, sequences.size());
    Assertions.assertEquals("AAAAACCCCC", sequences.get(0));
    Assertions.assertEquals("CCCCCAAAAA", sequences.get(1));
  }
}
