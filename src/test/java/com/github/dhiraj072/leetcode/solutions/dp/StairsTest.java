package com.github.dhiraj072.leetcode.solutions.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class StairsTest {

  private Stairs stairs = new Stairs();

  @Test
  public void countDistinctWaysEvenSteps() {

    assertEquals(stairs.distinctWaysToClimb(4), 5);
  }

  @Test
  public void countDistinctWaysOddSteps() {

    assertEquals(stairs.distinctWaysToClimb(5), 8);
  }

  @Test
  public void countDistinctWaysOneStep() {

    assertEquals(stairs.distinctWaysToClimb(1), 1);
  }

  @Test
  public void countDistinctWaysLargeSteps() {

    assertEquals(stairs.distinctWaysToClimb(40), 165580141);
  }
}