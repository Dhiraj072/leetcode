package com.github.dhiraj072.leetcode.solutions.arrays;

class ForLoopArrayRotator extends ArrayRotator {

  @Override
  int[] rotate(int[] nums, int k) {

    int[] initNums = nums.clone();
    for (int i = 0; i < nums.length; i++) {

      nums[mod(i + k, nums.length)] = initNums[i];
    }
    return nums;
  }
}
