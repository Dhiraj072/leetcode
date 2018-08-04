package com.github.dhiraj072.leetcode.solutions.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public abstract class FirstBadVersionFinderTestBase {

  private FirstBadVersionFinder finder;

  protected abstract FirstBadVersionFinder createFinder(int firstBadVersion);

  @Test
  public void testBadVersionEven() {

    finder = createFinder(4);
    assertEquals(4, finder.firstBadVersion(10));
  }

  @Test
  public void testBadVersionOdd() {

    finder = createFinder(2);
    assertEquals(2, finder.firstBadVersion(5));
  }

  @Test
  public void testBadVersionIsLastVersion() {

    finder = createFinder(2);
    assertEquals(2, finder.firstBadVersion(2));
  }

  @Test
  public void testBadVersionIsFirstVersion() {

    finder = createFinder(1);
    assertEquals(1, finder.firstBadVersion(5));
  }

  @Test
  public void testBadVersionBig() {

    finder = createFinder(170276671);
    assertEquals(170276671, finder.firstBadVersion(212675339));
  }

  @Test
  public void testBadVersionBigger() {

    finder = createFinder(1702766719);
    assertEquals(1702766719, finder.firstBadVersion(2126753390));
  }
}
