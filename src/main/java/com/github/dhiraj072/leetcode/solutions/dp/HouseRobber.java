package com.github.dhiraj072.leetcode.solutions.dp;

public class HouseRobber {

  static int rob(int nums[]) {

    if (nums.length == 0) {

      return 0;
    }
    return maxSum(nums, 0);
  }

  private static int maxSum(int[] nums, int n) {

    if (n == nums.length - 1) {

      return nums[n];
    }
    if (n == nums.length - 2) {

      return Math.max(nums[n], nums[n + 1]);
    }
    if (n == nums.length - 3) {

      return Math.max(nums[n] + nums[n + 2], nums[n + 1]);
    }
    return Math.max(maxSum(nums, n + 2) + nums[n],
        maxSum(nums, n + 3) +  Math.max(nums[n], nums[n + 1]));
  }

}
