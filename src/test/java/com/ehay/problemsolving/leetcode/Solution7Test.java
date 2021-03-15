package com.ehay.problemsolving.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}