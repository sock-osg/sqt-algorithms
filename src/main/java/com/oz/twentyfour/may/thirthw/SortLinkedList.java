package com.oz.twentyfour.may.thirthw;

import static com.oz.challenges.model.LinkedList.Node;

import com.oz.challenges.model.LinkedList;

/**
 * Given a linked list of integers list, create a function that sorts it.
 * Note that the function returns nothing, the linked list must be sorted in-place.
 * <p>
 * Example 1:
 * Input: list = 4 -> 8 -> 1 -> 6 -> 2 -> 5 -> null
 * Output: 1 -> 2 -> 4 -> 5 -> 6 -> 8 -> null
 */
public class SortLinkedList {

  public void sortList(LinkedList list) {
    Node left = list.head;
    Node current = left != null ? left.next : null;

    while (left != null) {
      if (current != null) {
        if (left.data > current.data) {
          int temp = left.data;
          left.data = current.data;
          current.data = temp;
        }

        current = current.next;
      } else {
        left = left.next;
        current = left != null ? left.next : null;
      }
    }
  }

  private Node mergeSortedLists(Node head1, Node head2) {
    Node ptr1 = head1;
    Node ptr2 = head2;
    Node returnedHead = null;
    Node tail = null;
    Node lower;
    while (ptr1 != null || ptr2 != null) {
      if (ptr1 != null && ptr2 != null) {
        if (ptr1.data < ptr2.data) {
          lower = ptr1;
          ptr1 = ptr1.next;
        } else {
          lower = ptr2;
          ptr2 = ptr2.next;
        }
      } else if (ptr1 != null) {
        lower = ptr1;
        ptr1 = ptr1.next;
      } else {
        lower = ptr2;
        ptr2 = ptr2.next;
      }
      if (returnedHead == null) {
        returnedHead = lower;
        tail = lower;
      } else {
        tail.next = lower;
        tail = tail.next;
      }
    }
    return returnedHead;
  }

  private Node sort(Node head) {
    if (head == null || head.next == null) {
      return head;
    }
    Node slow = head;
    Node fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    Node headRightHalf = slow.next;
    slow.next = null; // break left half
    head = this.sort(head);
    headRightHalf = this.sort(headRightHalf);
    return mergeSortedLists(head, headRightHalf);
  }

  // TODO: Analyze this fucking algorithm in depth, I don´t understand it at all.
  public void sortListTutorVersion(LinkedList list) {
    list.head = this.sort(list.head);
  }
}
