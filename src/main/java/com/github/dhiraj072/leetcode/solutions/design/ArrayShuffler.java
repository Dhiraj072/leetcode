package com.github.dhiraj072.leetcode.solutions.design;

import java.util.Random;

class ArrayShuffler {

  private int[] nums;
  private Random rand = new Random();

  ArrayShuffler(int[] nums) {

    this.nums = nums;
  }

  int[] reset() {

    return nums;
  }

  int[] shuffle() {

    int random;
    int tmp;
    int[] shuffledNums = nums.clone();
    for (int i = shuffledNums.length - 1; i >= 0; --i) {

      random = rand.nextInt(i + 1);
      tmp = shuffledNums[random];
      shuffledNums[random] = shuffledNums[i];
      shuffledNums[i] = tmp;
    }
    return shuffledNums;
  }
}
