package com.github.dhiraj072.leetcode.solutions.arrays;

public class InPlaceCyclicArrayRotator extends ArrayRotator {

  @Override
  public int[] rotate(int[] nums, int k) {

    int finIndex = mod(k, nums.length);
    int tmp = nums[0];
    int finIndexElement;
    do {

      finIndexElement = nums[finIndex];
      nums[finIndex] = tmp;
      tmp = finIndexElement;
      finIndex = mod(finIndex + k, nums.length);
    } while (finIndex != 0);

    nums[0] = tmp;
    return nums;
  }
}
