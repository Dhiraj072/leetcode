package com.github.dhiraj072.leetcode.solutions.arrays;

public class BinaryFirstBadVersionFinderTest extends
    FirstBadVersionFinderTestBase {

  @Override
  protected FirstBadVersionFinder createFinder(int firstBadVersion) {

    return new BinaryFirstBadVersionFinder(firstBadVersion);
  }

}
