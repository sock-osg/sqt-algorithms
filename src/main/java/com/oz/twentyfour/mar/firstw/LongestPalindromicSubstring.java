package com.oz.twentyfour.mar.firstw;

public class LongestPalindromicSubstring {

  private int start;
  private int end;

  public String longestPalindrome(String s) {
    start = 0;
    end = 0;

    if (s == null || s.isEmpty()) {
      return "";
    }

    for (int i = 0; i < s.length(); i++) {
      expandAroundCenter(s, i, i); // odd palindrome, example: "aba"
      expandAroundCenter(s, i, i + 1); // even palindrome, example: "abba"
    }

    return s.substring(start, end + 1);
  }

  /**
   * Expand Around Center: The approach treats each character in the input string as a potential center of a palindrome
   * and expands outward to find the longest palindrome. It has a time complexity of O(n^2) and is often faster in
   * practice due to small constant factors.
   *
   *                 center
   *            <- are equals? ->
   *          <-   are equals?   ->
   *        <-     are equals?     ->
   *
   * @param s
   * @param left
   * @param right
   */
  private void expandAroundCenter(String s, int left, int right) {
    // compare if both sides are equals.
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
      left--; // move left
      right++; // move right
    }
    left += 1;
    right -= 1;

    // Update new length against previous... if new is longest then update indexes
    if (end - start + 1 < right - left + 1) {
      start = left;
      end = right;
    }
  }
}
