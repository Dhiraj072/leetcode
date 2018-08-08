package com.github.dhiraj072.leetcode.solutions.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BuySellStockTest {

  private BuySellStock buySellStock = new BuySellStock();

  @Test
  public void testMaxProfitIsPositive() {

    int[] prices = {7, 1, 5, 3, 6, 4};
    assertEquals(5, buySellStock.maxProfit(prices));
  }

  @Test
  public void testMaxProfitIsZero() {

    int[] prices = {7, 5, 3, 2, 1};
    assertEquals(0, buySellStock.maxProfit(prices));
  }

  @Test
  public void testNoPricesProvided() {

    int[] prices = {};
    assertEquals(0, buySellStock.maxProfit(prices));
  }

  @Test
  public void testSinglePriceProvided() {

    int[] prices = {};
    assertEquals(0, buySellStock.maxProfit(prices));
  }

  @Test
  public void testTwoPricesProvidedPositiveProfit() {

    int[] prices = {1, 2};
    assertEquals(1, buySellStock.maxProfit(prices));
  }

  @Test
  public void testTwoPricesProvidedZeroProfit() {

    int[] prices = {122, 1};
    assertEquals(0, buySellStock.maxProfit(prices));
  }

  @Test
  public void testAllPricesSame() {

    int[] prices = {1, 1, 1, 1};
    assertEquals(0, buySellStock.maxProfit(prices));
  }
}