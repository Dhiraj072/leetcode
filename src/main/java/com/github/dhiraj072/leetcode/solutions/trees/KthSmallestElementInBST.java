package com.github.dhiraj072.leetcode.solutions.trees;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 *
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 *
 * Example 1:
 *
 * Input: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * Output: 1
 */
public class KthSmallestElementInBST {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(KthSmallestElementInBST.class);

  int result;

  public int kthSmallest(TreeNode root, int k) {
    traverse(root, 0, k);
    return result;
  }

  Integer traverse(TreeNode root, Integer count, Integer kthSmallest) {
    if (root == null || count > kthSmallest)
      return count;
    count = traverse(root.left, count, kthSmallest);
    count++;
    if (count.equals(kthSmallest)) {
      result = root.val;
      return count;
    }
    return traverse(root.right, count, kthSmallest);
  }
}
