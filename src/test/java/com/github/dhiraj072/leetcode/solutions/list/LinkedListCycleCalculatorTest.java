package com.github.dhiraj072.leetcode.solutions.list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListCycleCalculatorTest {

  @Test
  void testHasCycleShouldReturnTrue() {

    ListNode head = ListTestHelper.createCyclicList(new int[] {1, 2, 3});
    assertTrue(LinkedListCycleCalculator.hasCycle(head));
  }

  @Test
  void testHasCycleShouldReturnFalse() {

    ListNode head = ListTestHelper.createList(new int[] {1, 2, 3});
    assertFalse(LinkedListCycleCalculator.hasCycle(head));
  }

  @Test
  void testHasCycleForEmptyList() {

    ListNode head = ListTestHelper.createList(new int[] {});
    assertFalse(LinkedListCycleCalculator.hasCycle(head));
  }

  @Test
  void testHasCycleSingleNodeCyclicList() {

    ListNode head = ListTestHelper.createCyclicList(new int[] {1});
    assertTrue(LinkedListCycleCalculator.hasCycle(head));
  }

  @Test
  void testHasCycleTwoNodeCyclicList() {

    ListNode head = ListTestHelper.createCyclicList(new int[] {1, 2});
    assertTrue(LinkedListCycleCalculator.hasCycle(head));
  }

  @Test
  void testHasCycleSingleNodeNonCyclicList() {

    ListNode head = ListTestHelper.createList(new int[] {1});
    assertFalse(LinkedListCycleCalculator.hasCycle(head));
  }

  @Test
  void testHasCycleInMiddle() throws IllegalArgumentException {

    ListNode head = ListTestHelper.createCyclicList(new int[] {1, 2, 3, 4}, 1);
    assertTrue(LinkedListCycleCalculator.hasCycle(head));
  }
}