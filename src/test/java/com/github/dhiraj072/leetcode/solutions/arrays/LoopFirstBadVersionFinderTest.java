package com.github.dhiraj072.leetcode.solutions.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * TODO Refactor
 */
public class LoopFirstBadVersionFinderTest {

  private LoopFirstBadVersionFinder finder;

  @Test
  public void testBadVersionInBetween() {

    finder = new LoopFirstBadVersionFinder(4);
    assertEquals(4, finder.firstBadVersion(10));
  }

  @Test
  public void testBadVersionAtStart() {

    finder = new LoopFirstBadVersionFinder(1);
    assertEquals(1, finder.firstBadVersion(2));
  }

  @Test
  public void testBadVersionAtEnd() {

    finder = new LoopFirstBadVersionFinder(10);
    assertEquals(10, finder.firstBadVersion(10));
  }
}

