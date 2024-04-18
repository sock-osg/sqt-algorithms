package com.oz.twentyfour.feb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

  private final ReverseString reverseString = new ReverseString();

  @Test
  void reverseSockVersionTest() {
    Assertions.assertEquals("allipmart repus", this.reverseString.reverseSockVersion("super trampilla"));
    Assertions.assertEquals("sacixem y sacetza", this.reverseString.reverseSockVersion("aztecas y mexicas"));
  }

  @Test
  void reverseGptVersionTest() {
    Assertions.assertEquals("allipmart repus", this.reverseString.reverseGptVersion("super trampilla"));
    Assertions.assertEquals("sacixem y sacetza", this.reverseString.reverseGptVersion("aztecas y mexicas"));
  }
}
