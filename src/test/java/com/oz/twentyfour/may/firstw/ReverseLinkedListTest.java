package com.oz.twentyfour.may.firstw;

import static com.oz.twentyfour.may.firstw.ReverseLinkedList.LinkedList;
import static com.oz.twentyfour.may.firstw.ReverseLinkedList.Node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given a linked list of integers list, create a function that reverses it in-place without using an additional data
 * structure.
 *
 * Example 1:
 * Input: list = 5 -> 3 -> 6 -> 4 -> 7 -> null
 * Output: 7 -> 4 -> 6 -> 3 -> 5 -> null
 *
 * Example 2:
 * Input: list = 1 -> 2 -> 3 -> null
 * Output: 3 -> 2 -> 1 -> null
 */
class ReverseLinkedListTest {

  private final ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

  @Test
  void reverseTest() {
    LinkedList list = new LinkedList(new Node(5, new Node(3, new Node(6, new Node(4, new Node(7))))));
    this.reverseLinkedList.reverseList(list);

    Assertions.assertEquals(
        new LinkedList(new Node(7, new Node(4, new Node(6, new Node(3, new Node(5)))))).toString(),
        list.toString());
  }

  @Test
  void reverseTutorVersionTest() {
    LinkedList list = new LinkedList(new Node(5, new Node(3, new Node(6, new Node(4, new Node(7))))));
    this.reverseLinkedList.reverseListTutorVersion(list);

    Assertions.assertEquals(
        new LinkedList(new Node(7, new Node(4, new Node(6, new Node(3, new Node(5)))))).toString(),
        list.toString());
  }
}
