package com.github.dhiraj072.leetcode.solutions.trees;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinaryTreeMaxDepthCalculatorTest extends BinaryTreeTestBase {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(BinaryTreeMaxDepthCalculatorTest.class);

  private BinaryTreeNode root;
  private BinaryTreeMaxDepthCalculator binaryTreeMaxDepthCalculator;

  @Before
  public void init() {

    binaryTreeMaxDepthCalculator = new BinaryTreeMaxDepthCalculator();
  }

  @Test
  public void testMaxDepthNullNode() {

    int initArr[] = {};
    root = generateBinaryTree(initArr);
    assertEquals("Incorrect max-depth", 0,
        binaryTreeMaxDepthCalculator.maxDepth(root));
  }

  @Test
  public void testMaxDepthSingleNodeWithOneElement() {

    int initArr[] = { 1, 2 };
    root = generateBinaryTree(initArr);
    assertEquals("Incorrect max-depth", 2,
        binaryTreeMaxDepthCalculator.maxDepth(root));
  }

  @Test
  public void testMaxDepthSingleNode() {

    int initArr[] = {1};
    root = generateBinaryTree(initArr);
    assertEquals("Incorrect max-depth", 1,
        binaryTreeMaxDepthCalculator.maxDepth(root));
  }

  @Test
  public void testMaxDepthMultipleNodes() {

    int initArr[] = {1, 2, 3, 4, 5, -1, -1};
    root = generateBinaryTree(initArr);
    assertEquals("Incorrect max-depth", 3,
        binaryTreeMaxDepthCalculator.maxDepth(root));
  }
}
