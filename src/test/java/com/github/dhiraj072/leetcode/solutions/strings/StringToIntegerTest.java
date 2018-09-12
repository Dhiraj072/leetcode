package com.github.dhiraj072.leetcode.solutions.strings;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;

public class StringToIntegerTest {

  @Test
  public void testReturnThirtyTwo() {

    assertEquals(32, StringToInteger.convert("32"));
  }

  @Test
  public void testShouldReturnZero() {

    assertEquals(0, StringToInteger.convert("abc"));
  }

  @Test
  public void testShouldReturnMinus45() {

    assertEquals(-45, StringToInteger.convert("-45"));
  }

  @Test
  public void testShouldReturn145() {

    assertEquals(145, StringToInteger.convert("   +145"));
  }

  @Test
  public void testDoublePlusShouldReturnZero() {

    assertEquals(0, StringToInteger.convert("++45"));
  }

  @Test
  public void testEmptyShouldReturnZero() {

    assertEquals(0, StringToInteger.convert(""));
  }

  @Test
  public void testShouldReturnIntMax() {

    assertEquals(Integer.MAX_VALUE, StringToInteger.convert("321323233131331331"));
  }

  @Test
  public void testShouldReturnIntMin() {

    assertEquals(Integer.MIN_VALUE, StringToInteger.convert("-2313243242342424234"));
  }

  @Test
  public void testShouldReturnIntMinEdge() {

    assertEquals(Integer.MIN_VALUE, StringToInteger.convert("-6147483648"));
  }

  @Test
  public void testShouldReturnIntMaxEdgeCase() {

    assertEquals(2147483647, StringToInteger.convert("2147483647"));
  }

  @Test
  public void testShouldReturn100() {

    assertEquals(100, StringToInteger.convert("    0000100"));
  }

  @Test
  public void testShouldReturn1() {

    assertEquals(0, StringToInteger.convert("+-1"));
  }

  @Test
  public void testShouldReturn12345678() {

    assertEquals(12345678, StringToInteger.convert("  0000000000012345678"));
  }

  @Test
  public void testShouldReturn10() {

    assertEquals(10, StringToInteger.convert("010"));
  }


  // TODO Fix this
  @Disabled
  public void testShouldReturnIntMaxEdge() {

    assertEquals(2147483646, StringToInteger.convert("2147483646"));
  }
}
