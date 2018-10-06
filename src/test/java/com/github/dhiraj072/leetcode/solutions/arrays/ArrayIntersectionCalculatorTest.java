package com.github.dhiraj072.leetcode.solutions.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class ArrayIntersectionCalculatorTest {

  @Test
  void testIntersectCommonElementsTogether() {

    List<Integer> result = Arrays.asList(2, 2);
    assertEquals(result,
        ArrayIntersectionCalculator.intersect(new int[] {1,2,2,1}, new int[] {2,2}));
  }

  @Test
  void testIntersectCommonElementsSegregated() {

    List<Integer> result = Arrays.asList(4, 9);
    assertEquals(result,
        ArrayIntersectionCalculator.intersect(new int[] {4,9,5}, new int[] {9,4,9,8,4}));
  }

  @Test
  void testIntersectNoCommonElements() {

    List<Integer> result = Arrays.asList();
    assertEquals(result,
        ArrayIntersectionCalculator.intersect(new int[] {2,2}, new int[] {3,3}));
  }

  @Test
  void testIntersectOneElementCommon() {

    List<Integer> result = Arrays.asList(1);
    assertEquals(result,
        ArrayIntersectionCalculator.intersect(new int[] {1,2,3}, new int[] {5,6,1}));
  }

  @Test
  void testIntesectEmptyArrays() {

    List<Integer> result = Arrays.asList();
    assertEquals(result,
        ArrayIntersectionCalculator.intersect(new int[] {}, new int[] {}));
  }
}