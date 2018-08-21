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
    firstNode = ListTestHelper.createList(initialArr);
  }

  @Test
  public void testRemoveNode() {

    int expectedArr[] = {1, 2, 4, 5};
    listNodeDeleter.deleteNode(firstNode.next.next);
    assertTrue(ListTestHelper.verifyListValues(expectedArr, firstNode));
  }

  @Test
  public void testRemoveFirstNode() {

    int expectedArr[] = {2, 3, 4, 5};
    listNodeDeleter.deleteNode(firstNode);
    assertTrue(ListTestHelper.verifyListValues(expectedArr, firstNode));
  }

}
