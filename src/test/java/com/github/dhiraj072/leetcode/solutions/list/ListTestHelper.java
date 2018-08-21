package com.github.dhiraj072.leetcode.solutions.list;

final class ListTestHelper {

  /**
   * Test helper - Generates a linked list
   * @param arr Array of integer elements
   * @return first node of the linked list
   *
   * e.g. Given array [4,5,1,9], generated linked list looks like:
   *  4 -> 5 -> 1 -> 9
   *
   */
  ListNode createList(int[] arr) {

    ListNode prevNode = new ListNode(arr[0]);
    ListNode firstNode = prevNode;
    for (int i = 1; i < arr.length; ++i) {

      ListNode node = new ListNode(arr[i]);
      prevNode.next = node;
      prevNode = node;
    }

    return firstNode;
  }

  boolean verifyListValues(int[] expectedArr, ListNode node) {

    for (int num : expectedArr) {

      if (node.val != num) {

        return false;
      }
      node = node.next;
    }
    return true;
  }
}
