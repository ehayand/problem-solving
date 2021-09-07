package com.ehay.problemsolving.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution72410Test {

    @Test
    void solution() {
        Solution72410 solution72410 = new Solution72410();
        assertEquals("bat.y.abcdefghi", solution72410.solution("...!@BaT#*..y.abcdefghijklm"));
        assertEquals("z--", solution72410.solution("z-+.^."));
        assertEquals("aaa", solution72410.solution("=.="));
        assertEquals("123_.def", solution72410.solution("123_.def"));
        assertEquals("abcdefghijklmn", solution72410.solution("abcdefghijklmn.p"));
    }

    @Test
    void step1() {
        Solution72410 solution72410 = new Solution72410();
        assertEquals("...!@bat#*..y.abcdefghijklm", solution72410.step1("...!@BaT#*..y.abcdefghijklm"));
    }

    @Test
    void step2() {
        Solution72410 solution72410 = new Solution72410();
        assertEquals("...bat..y.abcdefghijklm", solution72410.step2("...!@bat#*..y.abcdefghijklm"));
        assertEquals(".", solution72410.step2("=.="));
    }

    @Test
    void step3() {
        Solution72410 solution72410 = new Solution72410();
        assertEquals(".bat.y.abcdefghijklm", solution72410.step3("...bat..y.abcdefghijklm"));
    }

    @Test
    void step4() {
        Solution72410 solution72410 = new Solution72410();
        assertEquals("bat.y.abcdefghijklm", solution72410.step4(".bat.y.abcdefghijklm."));
    }

    @Test
    void step5() {
        Solution72410 solution72410 = new Solution72410();
        assertEquals("bat.y.abcdefghijklm", solution72410.step5("bat.y.abcdefghijklm"));
        assertEquals("a", solution72410.step5(""));
    }

    @Test
    void step6() {
        Solution72410 solution72410 = new Solution72410();
        assertEquals("bat.y.abcdefghi", solution72410.step6("bat.y.abcdefghijklm"));
        assertEquals("abcdefghijklmn", solution72410.step6("abcdefghijklmn.p"));
    }

    @Test
    void step7() {
        Solution72410 solution72410 = new Solution72410();
        assertEquals("bat.y.abcdefghi", solution72410.step7("bat.y.abcdefghi"));
        assertEquals("aaa", solution72410.step7("a"));
        assertEquals("z--", solution72410.step7("z-"));
    }
}