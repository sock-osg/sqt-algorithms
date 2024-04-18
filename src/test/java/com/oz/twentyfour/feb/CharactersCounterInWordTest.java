package com.oz.twentyfour.feb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Count how many letter are repeated in a String word, ex: "appearance"
 * A = 3, P = 2, E=2, etc...
 */
class CharactersCounterInWordTest {

  private final CharactersCounterInWord charactersCounterInWord = new CharactersCounterInWord();

  @Test
  void foreachVersionTest() {
    Map<Character, Long> response = this.charactersCounterInWord.charactersCounterInWord("appearance");

    Assertions.assertEquals(3, response.get('a'));
    Assertions.assertEquals(2, response.get('p'));
  }

  @Test
  void streamVersionTest() {
    Map<Character, Long> response = this.charactersCounterInWord.charactersCounterInWordStreams("appearance");

    Assertions.assertEquals(3, response.get('a'));
    Assertions.assertEquals(2, response.get('p'));
  }

  @Test
  void linkedHashTest() {
    Map<String, String> hashMap = new HashMap<>();
    hashMap.put("hello", "1");
    hashMap.put("hello", "1");
    hashMap.put("hello", "1");

    LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
    linkedHashMap.put("hello", "1");
    linkedHashMap.put("hello", "1");
    linkedHashMap.put("hello", "1");

    ArrayList<Object> objects1 = new ArrayList<>();
    LinkedList<Object> objects = new LinkedList<>();
  }
}
