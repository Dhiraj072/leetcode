package com.github.dhiraj072.leetcode.solutions.dp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseRobberTest {

  @Test
  void robEvenHouses() {

    assertEquals(4,
        HouseRobber.rob(new int[] {1, 2, 3, 1}));
  }

  @Test
  void robOddHouses() {

    assertEquals(12,
        HouseRobber.rob(new int[] {2, 7, 9, 3, 1}));
  }

  @Test
  void robOddHouseNotAlternate() {

    assertEquals(4,
        HouseRobber.rob(new int[] {2,1,1,2}));
  }

  @Test
  void robOddHouseNotAlternate2() {

    assertEquals(4000,
        HouseRobber.rob(new int[] {1000,100,200,1000,20,2000}));
  }

  @Test
  void robSingleHouse() {

    assertEquals(4,
        HouseRobber.rob(new int[] {4}));
  }

  @Test
  void robTwoHouses() {

    assertEquals(4,
        HouseRobber.rob(new int[] {3, 4}));
  }

  @Test
  void robZeroHouses() {

    assertEquals(0,
        HouseRobber.rob(new int[] {}));
  }
}
