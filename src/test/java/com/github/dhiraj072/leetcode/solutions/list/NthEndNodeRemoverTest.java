package com.github.dhiraj072.leetcode.solutions.list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static com.github.dhiraj072.leetcode.solutions.list.ListTestHelper.verifyListValues;

class NthEndNodeRemoverTest {

  @Test
  void testRemoveNodeFromSecondHalf() {

    ListNode head = ListTestHelper.createList(new int[] {1, 2, 3, 4, 5, 6});
    assertTrue(verifyListValues(new int[] {1, 2, 3, 5, 6},
        NthEndNodeRemover.removeNthFromEnd(head, 3)));
  }

  @Test
  void testRemoveNodeFromFirstHalf() {

    ListNode head = ListTestHelper.createList(new int[] {1, 2, 3, 4, 5});
    assertTrue(verifyListValues(new int[] {1, 3, 4, 5},
        NthEndNodeRemover.removeNthFromEnd(head, 4)));
  }

  @Test
  void testRemoveFromSingleElementList() {

    ListNode head = ListTestHelper.createList(new int[] {1});
    assertTrue(verifyListValues(new int[] {},
        NthEndNodeRemover.removeNthFromEnd(head, 1)));
  }

  @Test
  void testRemoveLastElementFromList() {

    ListNode head = ListTestHelper.createList(new int[] {1, 2, 3, 4, 5});
    assertTrue(verifyListValues(new int[] {1, 2, 3, 4},
        NthEndNodeRemover.removeNthFromEnd(head, 1)));
  }

  @Test
  void testRemoveFirstElementFromList() {

    ListNode head = ListTestHelper.createList(new int[] {1, 2, 3});
    assertTrue(verifyListValues(new int[] {2, 3},
        NthEndNodeRemover.removeNthFromEnd(head, 3)));
  }

  @Test
  void testRemoveFromTwoElementList() {

    ListNode head = ListTestHelper.createList(new int[] {1, 2});
    assertTrue(verifyListValues(new int[] {1},
        NthEndNodeRemover.removeNthFromEnd(head, 1)));
  }

  @Test
  void testRemoveSecondElementFromTwoElementsList() {

    ListNode head = ListTestHelper.createList(new int[] {1, 2});
    assertTrue(verifyListValues(new int[] {2},
        NthEndNodeRemover.removeNthFromEnd(head, 2)));
  }

}