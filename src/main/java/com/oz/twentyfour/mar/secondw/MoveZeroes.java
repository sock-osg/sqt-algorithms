package com.oz.twentyfour.mar.secondw;

public class MoveZeroes {

  public int[] moveZeroes(int[] nums) {
    if (nums.length == 1) {
      return nums;
    }

    int firstZeroIndex = -1;
    for (int index = 0; index < nums.length - 1; index++) {
      if (nums[index] == 0) {
        if (firstZeroIndex == -1) {
          firstZeroIndex = index;
        }

        if (nums[index + 1] != 0) {
          nums[firstZeroIndex] = nums[index + 1];
          nums[index + 1] = 0;
          firstZeroIndex++;
        }
      }
    }

    return nums;
  }

  public int[] moveZeroesApuVersion(int[] nums) {
    int lastNonZeroFoundAt = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[lastNonZeroFoundAt] = nums[i];
        lastNonZeroFoundAt++;
      }
    }
    for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
      nums[i] = 0;
    }

    return nums;
  }
}
