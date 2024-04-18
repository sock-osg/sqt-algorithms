package com.oz.twentyfour.feb;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsChallenge {

  private static final Integer[] ELEMENTS = new Integer[]{ 2, 4, 6, 8, 9 };

  public List<Integer> getPairNumbers() {
    return Arrays.stream(ELEMENTS).filter(element -> element % 2 == 0).toList();
  }

  public Optional<Integer> existElement(final Integer elementToFind) {
    return Arrays.stream(ELEMENTS).filter(element -> element.equals(elementToFind)).findFirst();
  }

  public Integer existElementOrError(Integer elementToFind) {
    return Arrays.stream(ELEMENTS).filter(element -> element.equals(elementToFind)).findFirst().orElseThrow(IllegalArgumentException::new);
  }
}
