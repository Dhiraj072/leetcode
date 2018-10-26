package com.github.dhiraj072.leetcode.solutions.trees;

import static com.github.dhiraj072.leetcode.utils.TreeUtils.isBinarySearchTree;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SortedArrayToBinarySearchTreeTest extends BinaryTreeTestBase {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(SortedArrayToBinarySearchTreeTest.class);

  @Test
  void testArrayToTreeOddElements() {

    assertTrue(isBinarySearchTree(SortedArrayToBinarySearchTree.convert(new int[] {-10,-3,0,5,9})));
  }

  @Test
  void testArrayToTreeEvenElements() {

    assertTrue(isBinarySearchTree(SortedArrayToBinarySearchTree.convert(new int[] {1, 2, 3, 4, 5, 6})));
  }

  @Test
  void  tesArrayToTreeTwoNodes() {

    assertTrue(isBinarySearchTree(SortedArrayToBinarySearchTree.convert(new int[] {1, 2})));
  }

  @Test
  void testArrayToTreeThreeNodes() {

    assertTrue(isBinarySearchTree(SortedArrayToBinarySearchTree.convert(new int[] {-3, -2, -1})));
  }

  @Test
  void testArrayToTreeSingleNode() {

    assertTrue(isBinarySearchTree(SortedArrayToBinarySearchTree.convert(new int[] {1})));
  }

  @Test
  void testArrayToTreeZeroNodes() {

    assertTrue(isBinarySearchTree(SortedArrayToBinarySearchTree.convert(new int[] {})));
  }
}
