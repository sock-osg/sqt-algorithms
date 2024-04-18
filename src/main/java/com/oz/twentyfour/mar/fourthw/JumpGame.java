package com.oz.twentyfour.mar.fourthw;

public class JumpGame {

  // TODO: Analyze this fucking algorithm in depth, I don´t understand it at all.
  public boolean canJumpApuVersion(int[] nums) {
    int reachable = 0;

    for (int index = 0; index < nums.length && index <= reachable; index++) {
      reachable = Math.max(reachable, index + nums[index]);

      if (reachable >= nums.length - 1) {
        return true;
      }
    }

    return false;
  }
}
