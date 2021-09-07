package com.ehay.problemsolving.programmers.level1;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution77480 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] ranksPerEqualsCount = ranksPerEqualsCount();
        Set<Integer> lottoSet = intArrayToSetWithZerosRemoved(lottos);
        Set<Integer> winNumSet = intArrayToSet(win_nums);

        int changeableNumCount = winNumSet.size() - lottoSet.size();

        int equalsNumCount = 0;
        for (Integer num : lottoSet) {
            if (winNumSet.contains(num)) {
                equalsNumCount++;
            }
        }

        return new int[]{ranksPerEqualsCount[equalsNumCount + changeableNumCount], ranksPerEqualsCount[equalsNumCount]};
    }

    private int[] ranksPerEqualsCount() {
        return new int[]{6, 6, 5, 4, 3, 2, 1};
    }

    private Set<Integer> intArrayToSetWithZerosRemoved(int[] ints) {
        Set<Integer> integers = intArrayToSet(ints);
        integers.remove(0);
        return integers;
    }

    private Set<Integer> intArrayToSet(int[] ints) {
        return Arrays.stream(ints).boxed().collect(Collectors.toSet());
    }
}
