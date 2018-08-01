package com.github.dhiraj072.leetcode.solutions.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

/**
 * TODO Refactor
 */
public class BinaryFirstBadVersionFinderTest {

  private BinaryFirstBadVersionFinder finder;

  @Test
  public void testBadVersionEven() {

    finder = new BinaryFirstBadVersionFinder(4);
    assertEquals(4, finder.firstBadVersion(10));
  }

  @Test
  public void testBadVersionOdd() {

    finder = new BinaryFirstBadVersionFinder(2);
    assertEquals(2, finder.firstBadVersion(5));
  }

  @Test
  public void testBadVersionIsLastVersion() {

    finder = new BinaryFirstBadVersionFinder(2);
    assertEquals(2, finder.firstBadVersion(2));
  }

  @Test
  public void testBadVersionIsFirstVersion() {

    finder = new BinaryFirstBadVersionFinder(1);
    assertEquals(1, finder.firstBadVersion(5));
  }

  @Test
  public void testBadVersionBig() {

    finder = new BinaryFirstBadVersionFinder(170276671);
    assertEquals(170276671, finder.firstBadVersion(212675339));
  }

  @Test
  public void testBadVersionBigger() {

    finder = new BinaryFirstBadVersionFinder(1702766719);
    assertEquals(1702766719, finder.firstBadVersion(2126753390));
  }
}
