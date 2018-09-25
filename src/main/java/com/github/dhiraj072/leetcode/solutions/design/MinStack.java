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
  private int min;
  private int size;

  /** initialize your data structure here. */
  MinStack() {

    stack = new Stack<>();
    minUntil = new ArrayList<>();
    size = 0;
    min = Integer.MAX_VALUE;
  }

  void push(int x) {

    min = Math.min(x, min);
    minUntil.add(min);
    stack.push(x);
    size++;
    LOGGER.info("Stack {} Minuntil {}", stack, minUntil);
  }

  void pop() {

    stack.pop();
    minUntil.remove(size - 1);
    size--;
    if (size == 0) {

      min = Integer.MAX_VALUE;
    } else {

      min = minUntil.get(size - 1);
    }
    LOGGER.info("Stack {} Minuntil {}", stack, minUntil);
  }

  int top() {

    return stack.peek();
  }

  int getMin() {

    return minUntil.get(size - 1);
  }
}
