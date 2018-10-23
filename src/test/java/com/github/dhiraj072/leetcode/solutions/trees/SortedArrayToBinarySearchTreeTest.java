package com.github.dhiraj072.leetcode.solutions.trees;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SortedArrayToBinarySearchTreeTest extends BinaryTreeTestBase {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(SortedArrayToBinarySearchTreeTest.class);

  @Test
  void testArrayToTreeOddElements() {

    assertEquals(Arrays.asList(0, -10, 5, null, -3, null, 9),
        SortedArrayToBinarySearchTree.convert(new int[] {-10,-3,0,5,9}));
  }

  @Test
  void testArrayToTreeEvenElements() {

    assertEquals(Arrays.asList(3, 1, 5, null, 2, 4, 6),
        SortedArrayToBinarySearchTree.convert(new int[] {1, 2, 3, 4, 5, 6}));
  }
}
