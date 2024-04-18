package com.oz.twentyfour.feb;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactersCounterInWord {

  public Map<Character, Long> charactersCounterInWord(final String word) {
    Map<Character, Long> result = new HashMap<>();

    for (Character currentChar : word.toCharArray()) {
      result.put(currentChar, result.getOrDefault(currentChar, 0L) + 1L);
    }

    return result;
  }

  public Map<Character, Long> charactersCounterInWordStreams(final String word) {
//    return word.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(currChar -> currChar, Collectors.counting()));
    return word.chars().mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }
}
