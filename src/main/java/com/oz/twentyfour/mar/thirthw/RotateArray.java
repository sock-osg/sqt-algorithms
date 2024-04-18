package com.oz.twentyfour.mar.thirthw;

public class RotateArray {

  public int[] rotateApuVersion(int[] nums, int k) {
    k = k % nums.length; // how many times 'k' fits into numbers' length? Residue is the positions that should be moved.
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
    return nums;
  }

  private void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int tmp = nums[start];
      nums[start] = nums[end];
      nums[end] = tmp;
      start++;
      end--;
    }
  }
}
