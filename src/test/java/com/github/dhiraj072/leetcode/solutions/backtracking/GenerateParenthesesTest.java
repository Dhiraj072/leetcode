package com.github.dhiraj072.leetcode.solutions.backtracking;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class GenerateParenthesesTest {

  GenerateParentheses cut = new GenerateParentheses();

  @Test
  public void test() {

    assertEquals(Arrays.asList("()"), cut.generateParenthesis(1));
    assertEquals(Arrays.asList("(())", "()()"), cut.generateParenthesis(2));
    assertEquals(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"), cut.generateParenthesis(3));
  }
}