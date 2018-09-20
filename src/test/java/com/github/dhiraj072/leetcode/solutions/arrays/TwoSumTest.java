package com.github.dhiraj072.leetcode.solutions.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TwoSumTest {

  @Test
  void testShouldReturn01() {

    assertArrayEquals(new int[] {0, 1},
        TwoSum.twoSum(new int[] {2, 7, 11, 15}, 9));
  }

  @Test
  void testShouldReturn01TwoElements() {

    assertArrayEquals(new int[] {0,1},
        TwoSum.twoSum(new int[] {4, 3}, 7));
  }

  @Test
  void testNegativeElementArrayShouldReturn34() {

    assertArrayEquals(new int[] {2, 3},
        TwoSum.twoSum(new int[] {-2, -3, 6, 7, 3, -1, 4}, 13));
  }

  @Test
  void testDuplicateElementArrayShouldReturn34() {

    assertArrayEquals(new int[] {2, 3},
        TwoSum.twoSum(new int[] {-2, -1, 1, 1, 88, 44}, 2));
  }
}