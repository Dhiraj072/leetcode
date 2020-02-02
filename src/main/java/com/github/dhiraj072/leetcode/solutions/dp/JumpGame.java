package com.github.dhiraj072.leetcode.solutions.dp;

/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Determine if you are able to reach the last index.
 *
 * Example 1:
 *
 * Input: [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Example 2:
 *
 * Input: [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum
 *              jump length is 0, which makes it impossible to reach the last index.
 *
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/111/dynamic-programming/807/
 */
public class JumpGame {

  public boolean canJump(int[] nums) {
    int leftGoodIdx = nums.length - 1;
    for(int idx = nums.length - 2; idx >= 0; --idx) {
      if (idx + nums[idx] >= leftGoodIdx) {
        leftGoodIdx = idx;
      }
    }
    return leftGoodIdx == 0;
  }
}
