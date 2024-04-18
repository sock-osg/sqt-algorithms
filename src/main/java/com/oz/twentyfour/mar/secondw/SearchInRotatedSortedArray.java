package com.oz.twentyfour.mar.secondw;

public class SearchInRotatedSortedArray {

  public int apuVersion(int target, int[] nums) {
    int indexLeft = 0;
    int indexRight = nums.length - 1;

    while (indexLeft <= indexRight) {
      int indexMid = indexLeft + (indexRight - indexLeft) / 2; // (indexLeft + indexRight) / 2

      if (nums[indexMid] == target) {
        return indexMid;
      }

      // if indexLeft to indexMid is sorted
      if (nums[indexLeft] <= nums[indexMid]) {
        if (nums[indexLeft] <= target && nums[indexMid] > target) {
          indexRight = indexMid - 1;
        } else {
          indexLeft = indexMid + 1;
        }
      } else { // indexMid to indexRight part is sorted
        if (nums[indexMid] < target && target <= nums[indexRight]) { // min, max
          indexLeft = indexMid + 1;
        } else {
          indexRight = indexMid - 1;
        }
      }
    }

    return -1;
  }
}
