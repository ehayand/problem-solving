package com.ehay.problemsolving.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution81301Test {

    @Test
    void solution() {
        Solution81301 solution81301 = new Solution81301();
        assertEquals(1478, solution81301.solution("one4seveneight"));
        assertEquals(234567, solution81301.solution("23four5six7"));
        assertEquals(234567, solution81301.solution("2three45sixseven"));
        assertEquals(123, solution81301.solution("123"));
    }
}