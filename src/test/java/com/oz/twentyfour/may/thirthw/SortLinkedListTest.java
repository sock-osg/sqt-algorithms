package com.oz.twentyfour.may.thirthw;

import static com.oz.challenges.model.LinkedList.Node;

import com.oz.challenges.model.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortLinkedListTest {

  private final SortLinkedList sortLinkedList = new SortLinkedList();

  @Test
  void sortListTest() {
    LinkedList linkedList = new LinkedList(new Node(4, new Node(8, new Node(1, new Node(6, new Node(2, new Node(5, null)))))));

    this.sortLinkedList.sortList(linkedList);

    Assertions.assertEquals(1, linkedList.head.data);
    Assertions.assertEquals(2, linkedList.head.next.data);
    Assertions.assertEquals(4, linkedList.head.next.next.data);
    Assertions.assertEquals(5, linkedList.head.next.next.next.data);
    Assertions.assertEquals(6, linkedList.head.next.next.next.next.data);
    Assertions.assertEquals(8, linkedList.head.next.next.next.next.next.data);
    Assertions.assertNull(linkedList.head.next.next.next.next.next.next);
  }

  @Test
  void sortListTutorVersionTest() {
    LinkedList linkedList = new LinkedList(new Node(4, new Node(8, new Node(1, new Node(6, new Node(2, new Node(5, null)))))));

    this.sortLinkedList.sortListTutorVersion(linkedList);

    Assertions.assertEquals(1, linkedList.head.data);
    Assertions.assertEquals(2, linkedList.head.next.data);
    Assertions.assertEquals(4, linkedList.head.next.next.data);
    Assertions.assertEquals(5, linkedList.head.next.next.next.data);
    Assertions.assertEquals(6, linkedList.head.next.next.next.next.data);
    Assertions.assertEquals(8, linkedList.head.next.next.next.next.next.data);
    Assertions.assertNull(linkedList.head.next.next.next.next.next.next);
  }
}
