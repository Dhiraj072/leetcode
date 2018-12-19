package com.github.dhiraj072.leetcode.solutions.math;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that outputs the string representation of numbers from 1 to n.
 *
 * But for multiples of three it should output “Fizz” instead of the number
 * and for the multiples of five output “Buzz”.
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 */
public class FizzBuzz {

  public static List<String> fizzBuzz(int n) {

    List<String> result = new ArrayList<>();
    String toAdd;
    for (int i = 1; i <= n; ++i) {

      if (i % 3 == 0 && i % 5 == 0) {

        toAdd = "FizzBuzz";
      } else if (i % 3 == 0) {

        toAdd = "Fizz";
      } else if (i % 5 == 0) {

        toAdd = "Buzz";
      } else {

        toAdd = Integer.toString(i);
      }
      result.add(toAdd);
    }
    return result;
  }
}
