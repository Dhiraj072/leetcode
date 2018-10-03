package com.github.dhiraj072.leetcode.solutions.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayMergerTest {

  @Test
  void testMergeSimple() {

    int num1[] = new int[] {1,2,3,0,0,0};
    int num2[] = new int[] {2,5,6};
    ArrayMerger.merge(num1, 3, num2, 3);
    assertArrayEquals(new int[] {1,2,2,3,5,6}, num1);
  }

  @Test
  void testMergeArrayWithSameElements() {

    int num1[] = new int[] {1,1,0,0,0};
    int num2[] = new int[] {1,1,1};
    ArrayMerger.merge(num1, 2, num2, 3);
    assertArrayEquals(new int[] {1,1,1,1,1}, num1);
  }

  @Test
  void testMergeArrayWithOneElement() {

    int num1[] = new int[] {1,0};
    int num2[] = new int[] {1};
    ArrayMerger.merge(num1, 1, num2, 1);
    assertArrayEquals(new int[] {1,1}, num1);
  }

  @Test
  void testMergeEmptyArrays() {

    int num1[] = new int[] {};
    int num2[] = new int[] {};
    ArrayMerger.merge(num1, 0, num2, 0);
    assertArrayEquals(new int[] {}, num1);
  }

  @Test
  void testMergeOneEmptyAndOneNonEmptyArray() {

    int num1[] = new int[] {1,2};
    int num2[] = new int[] {};
    ArrayMerger.merge(num1, 2, num2, 0);
    assertArrayEquals(new int[] {1,2}, num1);
  }

  @Test
  void testMergeAgain() {

    int num1[] = new int[] {4,5,6,0,0,0};
    int num2[] = new int[] {1,2,3};
    ArrayMerger.merge(num1, 3, num2, 3);
    assertArrayEquals(new int[] {1,2,3,4,5,6}, num1);
  }

  @Test
  void testMerge1Again() {

    int num1[] = new int[] {2,0};
    int num2[] = new int[] {1};
    ArrayMerger.merge(num1, 1, num2, 1);
    assertArrayEquals(new int[] {1,2}, num1);
  }
}