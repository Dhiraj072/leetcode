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
  void testMin() {

    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    assertEquals(-3, minStack.getMin());
    minStack.pop();
    assertEquals(0, minStack.top());
    assertEquals(-2, minStack.getMin());
  }

  @Test
  void testPushAndPop() {

    minStack.push(1);
    assertEquals(1, minStack.top());
    minStack.push(2);
    assertEquals(2, minStack.top());
    minStack.pop();
    assertEquals(1, minStack.top());
  }

  @Test
  void testFailingTestOnLeetcode() {

        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        minStack.top();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.push(2147483647);
        minStack.top();
        minStack.getMin();
        minStack.push(-2147483648);
        minStack.top();
        minStack.getMin();
        minStack.pop();
        assertEquals(2147483647, minStack.getMin());
  }

}