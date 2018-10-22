package com.github.dhiraj072.leetcode.solutions.trees;

class BinaryTreeValidator {

  boolean validate(TreeNode root) {

    return validateBST(root, (long) Integer.MIN_VALUE, (long) Integer.MAX_VALUE);
  }

  private boolean validateBST(TreeNode root, long minValAllowed,
      long maxValAllowed) {

    if (root == null) {

      return true;
    } else {

      long rootVal = (long) root.val;
      if (!(rootVal >= minValAllowed) || !(rootVal <= maxValAllowed)) {

        return false;
      } else {

        return validateBST(root.left, minValAllowed, rootVal - 1) &&
            validateBST(root.right, rootVal + 1, maxValAllowed);
      }
    }
  }
}
