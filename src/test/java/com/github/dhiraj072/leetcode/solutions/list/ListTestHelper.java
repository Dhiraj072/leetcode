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

  static boolean verifyListValues(int[] expectedArr, ListNode node) {

    for (int num : expectedArr) {

      if (node.val != num) {

        LOGGER
            .info("Unmatched values - Expected: {} Actual: {}", num, node.val);
        return false;
      }
      node = node.next;
    }
    return true;
  }
}
