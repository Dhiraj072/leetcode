package com.github.dhiraj072.leetcode.solutions.arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleArrayRotator implements ArrayRotator {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(SimpleArrayRotator.class);

  @Override
  public int[] rotate(int[] nums, int k) {

    int[] result = new int[nums.length];
    System.arraycopy(nums, 0, result, k,nums.length -  k);
    System.arraycopy(nums, nums.length - k, result, 0,k);
    return result;
  }
}
