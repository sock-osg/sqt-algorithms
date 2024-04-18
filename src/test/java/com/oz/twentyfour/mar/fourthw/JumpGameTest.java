package com.oz.twentyfour.mar.fourthw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JumpGameTest {

  private final JumpGame jumpGame = new JumpGame();

  @Test
  void apuVersionTest() {
    Assertions.assertTrue(this.jumpGame.canJumpApuVersion(new int[]{ 2, 3, 1, 1, 4 }));
    //Assertions.assertFalse(this.jumpGame.canJumpApuVersion(new int[]{ 3, 2, 1, 0, 4 }));
  }
}
