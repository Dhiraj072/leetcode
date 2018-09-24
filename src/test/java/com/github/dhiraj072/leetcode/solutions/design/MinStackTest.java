package com.github.dhiraj072.leetcode.solutions.design;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinStackTest {

  private MinStack minStack;

  @BeforeEach
  public void setup() {

    minStack = new MinStack();
  }

  @Test
  void testPushAndPop() {

    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    assertEquals(-3, minStack.getMin());
    minStack.pop();
    assertEquals(0, minStack.top());
    assertEquals(-2, minStack.getMin());
  }
}