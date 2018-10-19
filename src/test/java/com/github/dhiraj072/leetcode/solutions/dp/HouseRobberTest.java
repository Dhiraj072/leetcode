package com.github.dhiraj072.leetcode.solutions.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
  void robASingleHouse() {

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

  @Test
  void robALotOfHouses() {

    assertEquals(7102,
        HouseRobber.rob(
            new int[]{226, 174, 214, 16, 218, 48, 153, 131, 128, 17, 157, 142,
                88, 43, 37, 157, 43, 221, 191, 68, 206, 23, 225, 82, 54, 118,
                111, 46, 80, 49, 245, 63, 25, 194, 72, 80, 143, 55, 209, 18, 55,
                122, 65, 66, 177, 101, 63, 201, 172, 130, 103, 225, 142, 46, 86,
                185, 62, 138, 212, 192, 125, 77, 223, 188, 99, 228, 90, 25, 193,
                211, 84, 239, 119, 234, 85, 83, 123, 120, 131, 203, 219, 10, 82,
                35, 120, 180, 249, 106, 37, 169, 225, 54, 103, 55, 166, 124}));
  }
}
