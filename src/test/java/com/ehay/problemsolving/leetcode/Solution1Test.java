package com.ehay.problemsolving.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution1Test {

    @Test
    void twoSum() {
        int[] nums1 = new int[]{2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = new int[]{0, 1};

        int[] nums2 = new int[]{3, 2, 4};
        int target2 = 6;
        int[] result2 = new int[]{1, 2};

        int[] nums3 = new int[]{1, 2, 3};
        int target3 = 0;
        int[] result3 = new int[]{};

        Solution1 solution1 = new Solution1();

        assertArrayEquals(result1, solution1.twoSum(nums1, target1));
        assertArrayEquals(result2, solution1.twoSum(nums2, target2));
        assertArrayEquals(result3, solution1.twoSum(nums3, target3));
    }
}
