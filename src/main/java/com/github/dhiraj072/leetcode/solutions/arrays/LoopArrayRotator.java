package com.github.dhiraj072.leetcode.solutions.arrays;

public class LoopArrayRotator extends ArrayRotator {

  @Override
  public int[] rotate(int[] nums, int steps) {

    steps = mod(steps, nums.length);
    int[] initNums = nums.clone();
    int finalIndex = 0;
    int initialIndex = mod(nums.length - steps, nums.length);
    while (finalIndex < nums.length) {

      nums[finalIndex] = initNums[initialIndex];
      finalIndex++;
      initialIndex = mod(initialIndex + 1, nums.length);
    }

    return nums;
  }

}
