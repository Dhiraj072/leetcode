package com.github.dhiraj072.leetcode.solutions.trees;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class BinaryTreeLevelOrderTraverserTest extends BinaryTreeTestBase {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(BinaryTreeLevelOrderTraverserTest.class);
  List<List<Integer>> result;
  TreeNode root;

  @AfterEach
  void after() {

    LOGGER.info("Traverse result {}", BinaryTreeLevelOrderTraverser.traverse(root));
  }
  @Test
  void testSimpleTraverse() {

    root = generateBinaryTree(new int[] {3,9,20,-1,-1,15,7});
    result = Arrays.asList(
        Arrays.asList(3),
        Arrays.asList(9, 20),
        Arrays.asList(15,7)
        );
    assertEquals(result, BinaryTreeLevelOrderTraverser.traverse(root));
  }

  @Test
  void testTraverseTreeWithTwoNodesLeft() {

    root = generateBinaryTree(new int[] {1, 2, -1});
    result = Arrays.asList(Arrays.asList(1), Arrays.asList(2));
    assertEquals(result, BinaryTreeLevelOrderTraverser.traverse(root));
  }

  @Test
  void testTraverseTreeWithTwoNodesRight() {

    root = generateBinaryTree(new int[] {1, -1, 1});
    result = Arrays.asList(Arrays.asList(1), Arrays.asList(1));
    assertEquals(result, BinaryTreeLevelOrderTraverser.traverse(root));
  }

  @Test
  void testTraverseTreeWithSingleNode() {

    root = generateBinaryTree(new int[] {1, -1, -1});
    result = Arrays.asList(Arrays.asList(1));
    assertEquals(result, BinaryTreeLevelOrderTraverser.traverse(root));
  }

  @Test
  void testTraverseEmptyTree() {

    root = generateBinaryTree(new int[] {});
    result = Arrays.asList();
    assertEquals(result, BinaryTreeLevelOrderTraverser.traverse(root));
  }

  @Test
  void testTraverseTreeWithSingleBranch() {

    root = generateBinaryTree(new int[] {1, 2, -1, 3, -1, -1, -1});
    result = Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3));
    assertEquals(result, BinaryTreeLevelOrderTraverser.traverse(root));
  }
}