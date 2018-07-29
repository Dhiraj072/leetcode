package com.github.dhiraj072.leetcode.solutions;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringReverserTest {

    StringReverser stringReverser;

    @Before
    public void init() {

        stringReverser = new StringReverser();
    }

    @Test
    public void testReverseStringSimple() {

        String result = stringReverser.reverseString("hello");
        assertEquals(result, "olleh");
    }

    @Test
    public void testReverseStringWithSpace() {

        String result = stringReverser.reverseString("hello world");
        assertEquals(result, "dlrow olleh");
    }

    @Test
    public void testReverseEmptyString() {

        String result = stringReverser.reverseString("");
        assertEquals(result,"");
    }

    @Test
    public void testReverseStringLengthOne() {

        String result = stringReverser.reverseString("h");
        assertEquals(result,"h");
    }

}
