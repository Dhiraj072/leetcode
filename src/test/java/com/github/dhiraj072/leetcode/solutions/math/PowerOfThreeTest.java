package com.github.dhiraj072.leetcode.solutions.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PowerOfThreeTest {

  @Test
  void test27ShouldReturnTrue() {

    assertTrue(PowerOfThree.isPowerOfThreeWithoutLoop(27));
  }

  @Test
  void test50ShouldReturnFalse() {

    assertFalse(PowerOfThree.isPowerOfThreeWithoutLoop(50));
  }

  @Test
  void test3ShouldReturnTrue() {

    assertTrue(PowerOfThree.isPowerOfThreeWithoutLoop(3));
  }

  @Test
  void test9ShouldReturnTrue() {

    assertTrue(PowerOfThree.isPowerOfThreeWithoutLoop(9));
  }

  @Test
  void test36ShouldReturnFalse() {

    assertFalse(PowerOfThree.isPowerOfThreeWithoutLoop(36));
  }

  @Test
  void test0ShouldReturnFalse() {

    assertFalse(PowerOfThree.isPowerOfThreeWithoutLoop(0));
  }

  @Test
  void test1ShouldReturnTrue() {

    assertTrue(PowerOfThree.isPowerOfThreeWithoutLoop(1));
  }
}