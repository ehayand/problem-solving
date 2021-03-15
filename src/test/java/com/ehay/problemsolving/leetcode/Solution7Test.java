package com.ehay.problemsolving.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution7Test {

    @Test
    void reverse() {
        int i1 = 1534236469;
        int i2 = 3210;
        int i3 = -1534236469;

        Solution7 solution7 = new Solution7();

        assertEquals(0, solution7.reverse(i1));
        assertEquals(123, solution7.reverse(i2));
        assertEquals(0, solution7.reverse(i3));
    }

    @Test
    void reverseString() {
        String str1 = "abc";
        String str2 = "012";
        String str3 = "-=+";

        Solution7 solution7 = new Solution7();

        assertEquals("cba", solution7.reverseString(str1));
        assertEquals("210", solution7.reverseString(str2));
        assertEquals("+=-", solution7.reverseString(str3));
    }

    @Test
    void reverseInteger() {
        String str1 = "0123";
        String str2 = "3210";
        String str3 = "-123";

        Solution7 solution7 = new Solution7();

        assertEquals("3210", solution7.reverseIntString(str1));
        assertEquals("123", solution7.reverseIntString(str2));
        assertEquals("-321", solution7.reverseIntString(str3));
    }
}