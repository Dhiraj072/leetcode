package com.github.dhiraj072.leetcode.solutions.math;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RomanToIntegerTestSteps {

  private RomanToIntegerConverter romanToIntegerConverter;
  private String romanNumeral;

  @Given("^I have a Roman to Integer converter")
  public void init() {

    romanToIntegerConverter = new RomanToIntegerConverter();
  }

  @When("^I provide the roman numeral (.+)$")
  public void setRomanNumeral(String numeral) {

    romanNumeral = numeral;
  }

  @Then("^the integer result is (\\d+)$")
  public void computeIntegerResult(int result) {

    assertEquals(result, romanToIntegerConverter.convert(romanNumeral));
  }
}