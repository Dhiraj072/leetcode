package com.github.dhiraj072.leetcode.solutions.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstBadVersionFinderTest {

  private FirstBadVersionFinder finder;
  private int[] arr;

  @Test
  public void testMultipleVersionsOdd() {

    arr = new int[]{1, 2, 3, 4, 5};
    finder = new FirstBadVersionFinder(arr, 4);
    assertEquals(4, finder.firstBadVersion(arr.length));
  }

  @Test
  public void testMultipleVersionsEven() {

    arr = new int[]{1, 2, 3, 4, 5, 6};
    finder = new FirstBadVersionFinder(arr, 2);
    assertEquals(2, finder.firstBadVersion(arr.length));
  }

  @Test
  public void testTwoVersions() {

    arr = new int[]{ 1, 2 };
    finder = new FirstBadVersionFinder(arr, 2);
    assertEquals(2, finder.firstBadVersion(arr.length));
  }

  @Test
  public void testSingleVersion() {

    arr = new int[]{ 1 };
    finder = new FirstBadVersionFinder(arr, 2);
    assertEquals(1, finder.firstBadVersion(arr.length));
  }

  @Test
  public void testNoVersions() {

    arr = new int[]{ };
    finder = new FirstBadVersionFinder(arr, 0);
    assertEquals(0, finder.firstBadVersion(arr.length));
  }
}
