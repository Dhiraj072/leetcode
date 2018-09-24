package com.github.dhiraj072.leetcode.solutions.design;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinStack {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(MinStack.class);

  private Stack<Integer> stack;
  private List<Integer> minUntil;
  int min;
  int size;

  /** initialize your data structure here. */
  public MinStack() {

    stack = new Stack<>();
    minUntil = new ArrayList<>();
    size = 0;
    min = Integer.MAX_VALUE;
  }

  public void push(int x) {

    min = Math.min(x, min);
    minUntil.add(min);
    stack.push(x);
    LOGGER.info("MinUntil {}, Stack {}", minUntil, stack);
    size++;
  }

  public void pop() {

    stack.pop();
    minUntil.remove(size - 1);
    size--;
  }

  public int top() {

    return stack.peek();
  }

  public int getMin() {

    return minUntil.get(size - 1);
  }
}
