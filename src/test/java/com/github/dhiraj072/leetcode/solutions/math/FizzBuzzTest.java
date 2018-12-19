package com.github.dhiraj072.leetcode.solutions.math;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  @Test
  public void testUpto3() {

    assertEquals(Arrays.asList("1", "2", "Fizz"),
        FizzBuzz.fizzBuzz(3));
  }

  @Test
  public void testUpto15() {

    assertEquals(Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"),
        FizzBuzz.fizzBuzz(15));
  }

  @Test
  public void testUptoZero() {

    assertEquals(new ArrayList<>(),
        FizzBuzz.fizzBuzz(0));
  }
}