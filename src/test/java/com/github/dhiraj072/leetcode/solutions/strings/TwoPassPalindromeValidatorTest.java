package com.github.dhiraj072.leetcode.solutions.strings;

import static org.junit.jupiter.api.Assertions.*;

class TwoPassPalindromeValidatorTest extends PalindromeValidatorTest {

  @Override
  PalindromeValidator getValidator() {

    return new TwoPassPalindromeValidator();
  }
}