package com.github.dhiraj072.leetcode.solutions.trees;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/555/
class BinaryTreeMaxDepthCalculator {

  private static final Logger LOGGER = LoggerFactory
      .getLogger(BinaryTreeMaxDepthCalculator.class);

  int maxDepth(TreeNode root) {

    if (null == root) {

      return 0;
    }

    return getMaxDepth(root, 1);
  }

  private int getMaxDepth(TreeNode root, int level) {

    if (null == root.left && null == root.right) {

      return level;
    }
    if (null == root.left) {

      return getMaxDepth(root.right, level + 1);
    }
    if (null == root.right) {

      return getMaxDepth(root.left, level + 1);
    }

    LOGGER.debug("Level {}:: Node: {}, Left: {}, Right: {}",
        level, root.val, root.left.val, root.right.val);

    int leftDepth = getMaxDepth(root.left, level + 1);
    int rightDepth = getMaxDepth(root.right, level + 1);
    return Integer.max(leftDepth, rightDepth);
  }
}
