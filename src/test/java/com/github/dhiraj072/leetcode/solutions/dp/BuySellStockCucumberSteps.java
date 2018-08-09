package com.github.dhiraj072.leetcode.solutions.dp;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuySellStockCucumberSteps {

  private static final Logger LOGGER = LoggerFactory
      .getLogger(BuySellStockCucumberSteps.class);

  private BuySellStock buySellStock;
  private int[] prices;

  @Given("^I have a Best Time To Buy And Sell Stock calculator")
  public void init() {

    LOGGER.debug("Creating buy sell stock calculator");
    buySellStock = new BuySellStock();
  }

  @When("^the stock prices are \"([^\"]*)\"$")
  public void setStockPrices(String stockPrices) {

    String[] stockPricesArr = stockPrices.split(",");
    prices = new int[stockPricesArr.length];
    for (int i = 0; i < stockPricesArr.length; ++i) {

      if (stockPricesArr[i].trim().equals("")) {

        prices[i] = 0;
      } else {

        prices[i] = Integer.parseInt(stockPricesArr[i].trim());
      }
    }
  }

  @Then("^the maximum profit I can make is (\\d+)$")
  public void verifyMaxProfit(int expectedProfit) {

    assertEquals(expectedProfit, buySellStock.maxProfit(prices));
  }
}
