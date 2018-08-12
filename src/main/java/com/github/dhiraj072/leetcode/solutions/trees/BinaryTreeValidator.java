package com.github.dhiraj072.leetcode.solutions.trees;

class BinaryTreeValidator {

  boolean validate(BinaryTreeNode root) {

    return validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private boolean validateBST(BinaryTreeNode root, int minValAllowed,
      int maxValAllowed) {

    if (root == null) {

      return true;
    } else if (!(root.val >= minValAllowed) || !(root.val <= maxValAllowed)) {

      return false;
    } else {

      return validateBST(root.left, minValAllowed, root.val - 1) &&
          validateBST(root.right, root.val + 1, maxValAllowed);
    }
  }
}
