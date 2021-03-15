package com.ehay.problemsolving.leetcode;

public class Solution7 {

    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public String reverseIntString(String str) {
        boolean isNegative = str.startsWith("-");
        if(isNegative) str = str.substring(1);

        char[] chars = reverseString(str).toCharArray();

        StringBuilder builder = new StringBuilder();
        boolean isZeroFill = true;

        for(char c : chars) {
            if(isZeroFill && c == '0') continue;
            builder.append(c);
            isZeroFill = false;
        }

        if(isNegative) builder.insert(0, "-");

        return builder.toString();
    }

    public int reverse(int i) {
        String reverseIntString = reverseIntString(String.valueOf(i));

        try {
            return Integer.parseInt(reverseIntString);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
