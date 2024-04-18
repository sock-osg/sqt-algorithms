package com.oz.twentyfour.feb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

/**
 * //intput
 * Given private static final Integer[] elements = [2,4,6,8,9] Then
 *
 * AC1 Write a function that get all pair numbers with API stream
 *
 * AC2 Write a function to filter X(number) and return x number with API stream
 *
 * AC3  Write a function to filter X(number) with API stream if not exits throw IllegalArgumentException
 */
class StreamsChallengeTest {

  private final StreamsChallenge streamsChallenge = new StreamsChallenge();

  @Test
  void getPairNumbersTest() {
    List<Integer> pairNumbers = this.streamsChallenge.getPairNumbers();

    Assertions.assertEquals(4, pairNumbers.size());
  }

  @Test
  void existElement() {
    Optional<Integer> elementFound = this.streamsChallenge.existElement(5);

    Assertions.assertFalse(elementFound.isPresent());
  }

  @Test
  void existElementOrError() {
    Assertions.assertEquals(2, this.streamsChallenge.existElementOrError(2));
    Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> this.streamsChallenge.existElementOrError(50));
  }
}
