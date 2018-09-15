package com.github.dhiraj072.leetcode.solutions.dp;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class MaxSubArrayTest {

  MaxSubArray maxSubArray = new MaxSubArray();

  @Test
  void testMaxSubArrayShouldReturnSix() {

    assertEquals(6,
        maxSubArray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
  }

  @Test
  void testMaxSubArrayShouldReturnTen() {

    assertEquals(10, maxSubArray.maxSubArray(new int[]{1, 2, 3, 4}));
  }

  @Test
  void testMaxSubArrayShouldReturnMinusOne() {

    assertEquals(-1, maxSubArray.maxSubArray(new int[]{-1, -2, -3, -4}));
  }

  @Test
  void testMaxSubArraySingleElementShouldReturnOne() {

    assertEquals(1, maxSubArray.maxSubArray(new int[]{1}));
  }

  // TODO Fix this
  @Disabled
  @Test
  void testMaxSubArrayTwoElementsShouldReturnMinusOne() {

    assertEquals(-1, maxSubArray.maxSubArray(new int[]{-2, -1}));
  }

  @Test
  void testMaxSubArrayTwoElementsShouldReturnFive() {

    assertEquals(5, maxSubArray.maxSubArray(new int[]{1, 4}));
  }

  @Test
  void testMaxSubArrayShouldReturnFour() {

    assertEquals(4,
        maxSubArray.maxSubArray(new int[]{2, -1, -3, -4, -1, 2, -1, -5, 4}));
  }


  @Test
  void testMaxSubArrayShouldReturnTwentyOne() {

    assertEquals(21, maxSubArray.maxSubArray(new int[]{8, -19, 5, -4, 20}));
  }

  @Test
  void testMaxSubArrayShouldReturnTwo() {

    assertEquals(3, maxSubArray.maxSubArray(new int[]{2, -1, 1, 1}));
  }
}