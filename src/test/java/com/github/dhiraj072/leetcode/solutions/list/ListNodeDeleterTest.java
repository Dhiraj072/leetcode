package com.github.dhiraj072.leetcode.solutions.list;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ListNodeDeleterTest {

  private ListNodeDeleter listNodeDeleter;
  private ListNode firstNode;
  private int initialArr[] = {1, 2, 3, 4, 5};

  @Before
  public void init() {

    listNodeDeleter = new ListNodeDeleter();
    firstNode = createList(initialArr);
  }

  @Test
  public void testRemoveNode() {

    int expectedArr[] = {1, 2, 4, 5};
    listNodeDeleter.deleteNode(firstNode.next.next);
    assertTrue(verifyListValues(expectedArr, firstNode));
  }

  @Test
  public void testRemoveFirstNode() {

    int expectedArr[] = {2, 3, 4, 5};
    listNodeDeleter.deleteNode(firstNode);
    assertTrue(verifyListValues(expectedArr, firstNode));
  }

  /**
   * Test helper - Generates a linked list
   * @param arr Array of integer elements
   * @return first node of the linked list
   *
   * e.g. Given array [4,5,1,9], generated linked list looks like:
   *  4 -> 5 -> 1 -> 9
   *
   */
  private ListNode createList(int[] arr) {

    ListNode prevNode = new ListNode(arr[0]);
    ListNode firstNode = prevNode;
    for (int i = 1; i < arr.length; ++i) {

      ListNode node = new ListNode(arr[i]);
      prevNode.next = node;
      prevNode = node;
    }

    return firstNode;
  }

  private boolean verifyListValues(int[] expectedArr, ListNode node) {

    for (int num : expectedArr) {

      if (node.val != num) {

        return false;
      }
      node = node.next;
    }
    return true;
  }
}
