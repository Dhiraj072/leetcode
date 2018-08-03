package com.github.dhiraj072.leetcode.solutions.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public abstract class ArrayRotatorTestBase {

  private ArrayRotator arrayRotator;

  @Before
  public void setUp() {

    arrayRotator = createRotator();
  }

  protected abstract ArrayRotator createRotator();

  @Test
  public void rotateStepInMiddle() {

    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int[] expectedArr = {5, 6, 7, 1, 2, 3, 4};
    int[] result = arrayRotator.rotate(arr, 3);
    assertArrayEquals(expectedArr, result);
  }

  @Test
  public void rotateStepOne() {

    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int[] expectedArr = {7, 1, 2, 3, 4, 5, 6};
    int[] result = arrayRotator.rotate(arr, 1);
    assertArrayEquals(expectedArr, result);
  }

  @Test
  public void rotateStepZero() {

    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int[] expectedArr = {1, 2, 3, 4, 5, 6, 7};
    int[] result = arrayRotator.rotate(arr, 0);
    assertArrayEquals(expectedArr, result);
  }

  @Test
  public void rotateStepEqualsArrayLength() {

    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int[] expectedArr = {1, 2, 3, 4, 5, 6, 7};
    int[] result = arrayRotator.rotate(arr, 7);
    assertArrayEquals(expectedArr, result);
  }

  // TODO FIXME gives out of bounds expception
  @Ignore
  public void rotateSingleElementArray() {

    int[] arr = {1};
    int[] expectedArr = {1};
    int[] result = arrayRotator.rotate(arr, 7);
    assertArrayEquals(expectedArr, result);
  }
}
