package com.oz.twentyfour.may.firstw;

import static com.oz.twentyfour.may.firstw.PalindromeListNodes.Node;
import static com.oz.twentyfour.may.firstw.PalindromeListNodes.LinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given a linked list of integers list, create a boolean function that checks if it's a palindrome linked list in
 * constant space complexity.
 *
 * Example 1:
 * Input: list = 1 -> 4 -> 6 -> 5 -> 6 -> 4 -> 1 -> null
 * Output: true
 *
 * Example 2:
 * Input: list = 8 -> 3 -> 1 -> 8 -> null
 * Output: false
 *
 * Example 3:
 * Input: list = 6 -> null
 * Output: true
 */
/*
1 - 4 - 6 - 5 - 6 - 4 - 1 - 5 - 1 - 4 - 6 - 5 - 6 - 4 - 1
 */
class PalindromeListNodesTest {

  private final PalindromeListNodes palindromeListNodes = new PalindromeListNodes();

  @Test
  void isPalindromeLoopVersion() {
    Assertions.assertTrue(this.palindromeListNodes.isPalindromeListTutorLoopVersion(
        new LinkedList(new Node(1, new Node(4, new Node(6, new Node(5, new Node(6, new Node(4, new Node(1))))))))
    ));
  }

  @Test
  void isPalindromeOptimalVersion() {
    Assertions.assertTrue(this.palindromeListNodes.isPalindromeListTutorOptimalVersion(
        new LinkedList(new Node(1, new Node(4, new Node(6, new Node(5, new Node(6, new Node(4, new Node(1))))))))
    ));
  }
}
