package com.github.dhiraj072.leetcode.solutions.arrays;

public class SingleNumberBitManipulation implements SingleNumber {

  @Override
  public int singleNumber(int[] nums) {

    int result = 0;
    for (int num : nums) {

      result =  result ^ num;
    }
    return result;
  }
}
