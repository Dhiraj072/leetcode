package com.github.dhiraj072.leetcode.solutions.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MergeSortedArrayTest {

  @Test
  void testMerge() {

    int num1[] = new int[] {1,2,3,0,0,0};
    int num2[] = new int[] {2,5,6};
    MergeSortedArray.merge(num1, 3, num2, 3);
    assertArrayEquals(new int[] {1,2,2,3,5,6}, num1);
  }
}