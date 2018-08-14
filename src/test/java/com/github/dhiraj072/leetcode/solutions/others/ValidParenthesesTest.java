package com.github.dhiraj072.leetcode.solutions.others;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidParenthesesTest {


  private ValidParentheses validParentheses = new ValidParentheses();

  @Test
  public void testValidParentheses() {

    assertTrue(validParentheses.validate("({})"));
  }

  @Test
  public void testValidParenthesesSeries() {

    assertTrue(validParentheses.validate("(){}[]"));
  }

  @Test
  public void testValidParenthesesTwoBraces() {

    assertTrue(validParentheses.validate("()"));
  }

  @Test
  public void testValidParenthesesEmptyString() {

    assertTrue(validParentheses.validate(""));
  }

  @Test
  public void testInvalidParenthesesOdd() {

    assertFalse(validParentheses.validate("{})"));
  }

  @Test
  public void testInvalidParenthesesEven() {

    assertFalse(validParentheses.validate("{(})"));
  }

  @Test
  public void testInvalidParenthesesSingleBrace() {

    assertFalse(validParentheses.validate("{"));
  }

}