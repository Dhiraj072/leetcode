package com.github.dhiraj072.leetcode.solutions.dp;

class MaxSubArray {

  int maxSubArray(int[] nums) {

    if (nums.length == 0) {

      return 0;
    }
    int sum = nums[0];
    int maxSum = nums[0];
    int min = nums[0];
    for (int i = 1; i < nums.length; ++i) {

      sum = sum + nums[i];
      maxSum = Math.max(maxSum, sum);
      min = Math.min(min, nums[i]);
      if (sum < 0) {

        sum = 0;
      }
    }
    return maxSum;
  }
}
