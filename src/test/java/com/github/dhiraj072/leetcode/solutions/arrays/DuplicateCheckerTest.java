package com.github.dhiraj072.leetcode.solutions.arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DuplicateCheckerTest {

  private DuplicateChecker checker = new DuplicateChecker();

  @Test
  public void checkDuplicatesPresent() {

    int[] arr = {1, 2, 1, 4};
    assertTrue(checker.containsDuplicate(arr));
  }

  @Test
  public void checkDuplicatesAbsent() {

    int[] arr = {1, 2, 3, 4};
    assertFalse(checker.containsDuplicate(arr));
  }

  @Test
  public void checkDuplicatesSingleElement() {

    int[] arr = {1};
    assertFalse(checker.containsDuplicate(arr));
  }

  @Test
  public void checkDuplicatesNoElements() {

    int[] arr = {};
    assertFalse(checker.containsDuplicate(arr));
  }
}