package com.oz.twentyfour.apr.firstw;

public class ProductOfArrayExceptSelf {

  public int[] productExceptSelfApuVersion(int[] nums) {
    // The length of the input array
    int length = nums.length;

    // Final answer array to be returned
    int[] answer = new int[length];

    // answer[i] contains the product of all the elements to the left
    // Note: for the element at index '0', there are no elements to the left, so the answer[0] would be 1
    answer[0] = 1;
    for (int index = 1; index < length; index++) {
      // answer[index - 1] already contains the product of elements to the left of 'index - 1'
      // Simply multiplying it with nums[index - 1] would give the product of all elements to the left of index 'index'
      answer[index] = nums[index - 1] * answer[index - 1];
    }

    // rightProduct contains the product of all the elements to the right
    // Note: for the element at index 'length - 1', there are no elements to the right, so the rightProduct would be 1
    int rightProduct = 1;
    for (int index = length - 1; index >= 0; index--) {
      // For the index 'index', rightProduct would contain the product of all elements to the right. We update rightProduct accordingly
      answer[index] = answer[index] * rightProduct;
      rightProduct *= nums[index];
    }

    return answer;
  }
}
