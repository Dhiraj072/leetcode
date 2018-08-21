package com.github.dhiraj072.leetcode.solutions.list;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ListNodeDeleterTest {

  private ListNodeDeleter listNodeDeleter;
  private ListNode firstNode;
  private ListTestHelper helper;
  private int initialArr[] = {1, 2, 3, 4, 5};

  @Before
  public void init() {

    listNodeDeleter = new ListNodeDeleter();
    helper = new ListTestHelper();
    firstNode = helper.createList(initialArr);
  }

  @Test
  public void testRemoveNode() {

    int expectedArr[] = {1, 2, 4, 5};
    listNodeDeleter.deleteNode(firstNode.next.next);
    assertTrue(helper.verifyListValues(expectedArr, firstNode));
  }

  @Test
  public void testRemoveFirstNode() {

    int expectedArr[] = {2, 3, 4, 5};
    listNodeDeleter.deleteNode(firstNode);
    assertTrue(helper.verifyListValues(expectedArr, firstNode));
  }

}
