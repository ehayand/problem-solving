package com.ehay.problemsolving.programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class Solution81301 {
    public int solution(String s) {
        Map<String, String> replaceMap = getReplaceMap();

        RapperString rapperString = new RapperString(s);

        replaceMap.forEach((key, value) -> rapperString.replace(key, value));

        return rapperString.parseInt();
    }

    private class RapperString {
        private String s;

        private RapperString(String s) {
            this.s = s;
        }

        private void replace(String from, String to) {
            s = s.replace(from, to);
        }

        private int parseInt() {
            return Integer.parseInt(s);
        }
    }

    private Map<String, String> getReplaceMap() {
        Map<String, String> replaceMap = new HashMap<>();
        replaceMap.put("zero", "0");
        replaceMap.put("one", "1");
        replaceMap.put("two", "2");
        replaceMap.put("three", "3");
        replaceMap.put("four", "4");
        replaceMap.put("five", "5");
        replaceMap.put("six", "6");
        replaceMap.put("seven", "7");
        replaceMap.put("eight", "8");
        replaceMap.put("nine", "9");
        return replaceMap;
    }
}
