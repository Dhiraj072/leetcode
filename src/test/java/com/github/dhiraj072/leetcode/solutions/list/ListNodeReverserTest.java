package com.github.dhiraj072.leetcode.solutions.list;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
abstract class ListNodeReverserTest {

  private ListNodeReverser reverser;

  @BeforeAll
  void init() {

    reverser = createListNodeReverser();
  }

  abstract ListNodeReverser createListNodeReverser();

  @Test
  void testReverseListWithFiveNodes() {

    int[] initialArr = {1, 2, 3, 4, 5};
    int[] expectedArr = {5, 4, 3, 2, 1};
    ListNode head = ListTestHelper.createList(initialArr);
    ListNode result = reverser.reverse(head);
    assertTrue(ListTestHelper.verifyListValues(expectedArr, result));
  }

  @Test
  void testReverseListWithSixNodes() {

    int[] initialArr = {1, 2, 3, 4, 5, 6};
    int[] expectedArr = {6, 5, 4, 3, 2, 1};
    ListNode head = ListTestHelper.createList(initialArr);
    ListNode result = reverser.reverse(head);
    assertTrue(ListTestHelper.verifyListValues(expectedArr, result));
  }

  @Test
  void testReverseListWithTwoNodes() {

    int[] initialArr = {1, 2};
    int[] expectedArr = {2, 1};
    ListNode head = ListTestHelper.createList(initialArr);
    ListNode result = reverser.reverse(head);
    assertTrue(ListTestHelper.verifyListValues(expectedArr, result));
  }

  @Test
  void testReverseListWithOneNode() {

    int[] initialArr = {1};
    int[] expectedArr = {1};
    ListNode head = ListTestHelper.createList(initialArr);
    ListNode result = reverser.reverse(head);
    assertTrue(ListTestHelper.verifyListValues(expectedArr, result));
  }

  @Test
  void testReverseListWithZeroNodes() {

    int[] initialArr = {};
    int[] expectedArr = {};
    ListNode head = ListTestHelper.createList(initialArr);
    ListNode result = reverser.reverse(head);
    assertTrue(ListTestHelper.verifyListValues(expectedArr, result));
  }
}
