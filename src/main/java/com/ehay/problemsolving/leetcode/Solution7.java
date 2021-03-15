package com.ehay.problemsolving.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution7 {

    public int reverse(int i) {
        Queue<Integer> queue = new LinkedList<>();

        while (Math.abs(i) > 0) {
            int current = i % 10;
            i = i / 10;
            queue.add(current);
        }

        double resultDouble = 0;

        while (!queue.isEmpty()) {
            int current = queue.remove();
            resultDouble = resultDouble * 10 + current;
        }

        if (Math.abs(resultDouble) > Math.pow(2, 31)) return 0;

        return (int) resultDouble;
    }
}
