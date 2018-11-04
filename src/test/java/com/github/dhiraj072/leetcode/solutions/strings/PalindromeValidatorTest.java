package com.github.dhiraj072.leetcode.solutions.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
abstract class PalindromeValidatorTest {

  private PalindromeValidator palindromeValidator;

  @BeforeAll
  void init() {

    palindromeValidator = getValidator();
  }

  abstract PalindromeValidator getValidator();

  @Test
  void testStringWithEvenChars() {

    assertTrue(palindromeValidator.isValid("abccba"));
  }

  @Test
  void testStringWithOddChars() {

    assertTrue(palindromeValidator.isValid("aba"));
  }

  @Test
  void testStringWithSingleChar() {

    assertTrue(palindromeValidator.isValid("a"));
  }

  @Test
  void testStringNotAPalindrome() {

    assertFalse(palindromeValidator.isValid("abcdef"));
  }

  @Test
  void testEmptyString() {

    assertTrue(palindromeValidator.isValid(""));
  }
}
