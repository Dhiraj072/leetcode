package com.github.dhiraj072.leetcode.solutions.list;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

final class ListTestHelper {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(ListTestHelper.class);

  /**
   * Test helper - Generates a linked list
   *
   * @param arr Array of integer elements
   * @return first node of the linked list
   *
   * e.g. Given array [4,5,1,9], generated linked list looks like: 4 -> 5 -> 1
   * -> 9
   */
  static ListNode createList(int[] arr) {

    if (arr.length == 0) {

      return null;
    }
    ListNode prevNode = new ListNode(arr[0]);
    ListNode firstNode = prevNode;
    for (int i = 1; i < arr.length; ++i) {

      ListNode node = new ListNode(arr[i]);
      prevNode.next = node;
      prevNode = node;
    }
    return firstNode;
  }

  static ListNode createCyclicList(int[] arr) {

    ListNode head = createList(arr);
    if (head == null) {

      return head;
    }
    ListNode current = head;
    while (current.next != null) {

      current = current.next;
    }
    current.next = head;
    return head;
  }

  static ListNode createCyclicList(int[] arr, int cycleAt)
      throws IllegalArgumentException {

    ListNode head = createList(arr);
    if (head == null) {

      return head;
    }
    ListNode current = head;
    ListNode cycleAtNode = null;
    int node = 0;
    while (current.next != null) {

      if (node == cycleAt) {

        cycleAtNode = current;
      }
      current = current.next;
      node++;
    }
    if (cycleAtNode == null) {

      throw new IllegalArgumentException("Invalid value for cycleAt: " +
          cycleAt + ". The corresponding node is null");
    }
    current.next = cycleAtNode;
    return head;
  }

  static boolean verifyListValues(int[] expectedArr, ListNode node) {

    int index = 0;
    for (int num : expectedArr) {

      if (node.val != num) {

        LOGGER
            .info("Unmatched values at index {} - Expected: {} Actual: {}", index, num, node.val);
        return false;
      }
      node = node.next;
      index++;
    }
    return true;
  }
}
