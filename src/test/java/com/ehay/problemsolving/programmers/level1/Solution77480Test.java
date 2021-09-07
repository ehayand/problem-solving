package com.ehay.problemsolving.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution77480Test {

    @Test
    void solution() {
        Solution77480 solution77480 = new Solution77480();
        assertTrue(Arrays.equals(new int[]{3, 5}, solution77480.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19})));
        assertTrue(Arrays.equals(new int[]{1, 6}, solution77480.solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25})));
        assertTrue(Arrays.equals(new int[]{1, 1}, solution77480.solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35})));
        assertTrue(Arrays.equals(new int[]{6, 6}, solution77480.solution(new int[]{1, 2, 3, 4, 5, 6}, new int[]{7, 8, 9, 10, 11, 12})));
    }
}