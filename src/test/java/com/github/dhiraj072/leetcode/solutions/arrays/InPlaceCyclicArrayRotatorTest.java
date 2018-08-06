package com.github.dhiraj072.leetcode.solutions.arrays;

import org.junit.Ignore;

@Ignore
public class InPlaceCyclicArrayRotatorTest extends ArrayRotatorTestBase {

  @Override
  protected ArrayRotator createRotator() {

    return new InPlaceCyclicArrayRotator();
  }
}