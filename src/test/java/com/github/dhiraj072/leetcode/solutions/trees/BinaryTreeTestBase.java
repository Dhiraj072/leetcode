package com.github.dhiraj072.leetcode.solutions.trees;

import java.util.ArrayList;
import java.util.List;

abstract class BinaryTreeTestBase {

  /**
   * Test helper - Generates a binary tree
   * @param arr - Array of numbers to generate binary tree
   * @return root node of the binary tree
   *
   *  -1 is interpreted as null node
   * e.g.
   * Given array [3,9,20,-1,-1,15,7], the generated binary tree is
   *     3
   *   /   \
   *   9   20
   *      /  \
   *     15   7
   *
   */
  TreeNode generateBinaryTree(int[] arr) {

    if (arr.length == 0) {

      return null;
    }
    return buildNode(arr, 0, 1, 2);
  }

  private TreeNode buildNode(int[] arr, int nodeIndex, int leftNodeIndex,
      int rightNodeIndex) {

    if (nodeIndex >= arr.length || arr[nodeIndex] == -1) {

      return null;
    }

    TreeNode node = new TreeNode(arr[nodeIndex]);
    node.left = buildNode(arr, leftNodeIndex, 2 * (leftNodeIndex + 1) - 1,
        2 * (leftNodeIndex + 1));
    node.right = buildNode(arr, rightNodeIndex, 2 * (rightNodeIndex + 1) - 1,
        2 * (rightNodeIndex + 1));

    return node;
  }

  static List<Integer> traverseResult;

  static List<Integer> depthTraverseBinaryTree(TreeNode node) {

    traverseResult = new ArrayList<>();
    depthTraverse(node);
    return traverseResult;
  }

  private static void depthTraverse(TreeNode node) {

    if (node == null) {

      traverseResult.add(null);
      return;
    }
    traverseResult.add(node.val);
    depthTraverse(node.left);
    depthTraverse(node.right);
  }
}
