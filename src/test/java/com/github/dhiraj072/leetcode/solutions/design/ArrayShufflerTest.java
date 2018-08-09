package com.github.dhiraj072.leetcode.solutions.design;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayShufflerTest {

  private static final Logger LOGGER = LoggerFactory
      .getLogger(ArrayShufflerTest.class);

  private ArrayShuffler arrayShuffler;

  @Test
  public void testSimpleShuffle() {

    int[] arr = {1, 2, 3};
    List<int[]> possibleShuffles = new ArrayList<>();
    possibleShuffles.add(new int[]{1, 2, 3});
    possibleShuffles.add(new int[]{1, 3, 2});
    possibleShuffles.add(new int[]{2, 3, 1});
    possibleShuffles.add(new int[]{2, 1, 3});
    possibleShuffles.add(new int[]{3, 2, 1});
    possibleShuffles.add(new int[]{3, 1, 2});
    verifyShuffle(arr, possibleShuffles);
  }

  @Test
  public void testShuffleSingleElement() {

    int[] arr = {1};
    List<int[]> possibleShuffles = new ArrayList<>();
    possibleShuffles.add(new int[]{1});
    verifyShuffle(arr, possibleShuffles);
  }

  @Test
  public void testReset() {

    arrayShuffler = new ArrayShuffler(new int[]{1, 2, 3, 4});
    arrayShuffler.shuffle();
    LOGGER.info("{} ", arrayShuffler.reset());
    assertArrayEquals(new int[]{1, 2, 3, 4}, arrayShuffler.reset());
  }

  private void verifyShuffle(int[] arr, List<int[]> possibleShuffles) {

    arrayShuffler = new ArrayShuffler(arr);
    int[] shuffledArr = arrayShuffler.shuffle();
    assertTrue(possibleShuffles.stream()
        .anyMatch(possibleArr -> Arrays.equals(possibleArr, shuffledArr)));
  }

}