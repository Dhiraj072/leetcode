package com.github.dhiraj072.leetcode.solutions.trees;

public class SortedArrayToBinarySearchTree {

  public static TreeNode convert(int[] sortedArray){

    if (sortedArray.length == 0) {

      return null;
    }
    return binarySearchAndBuildTree(sortedArray, 0, sortedArray.length - 1);
  }

  private static TreeNode binarySearchAndBuildTree(int[] sortedArray, int start, int end) {

    int mid = (start + end) / 2;
    TreeNode node = new TreeNode(sortedArray[mid]);
    if (start > end) {

      return null;
    }
    node.left = binarySearchAndBuildTree(sortedArray, start, mid - 1);
    node.right = binarySearchAndBuildTree(sortedArray,mid + 1, end);
    return node;
  }
}
