package com.github.dhiraj072.leetcode.solutions.arrays;

public class LoopFirstBadVersionFinderTest extends
    FirstBadVersionFinderTestBase {
  
  @Override
  protected FirstBadVersionFinder createFinder(int firstBadVersion) {

    return new LoopFirstBadVersionFinder(firstBadVersion);
  }
}

