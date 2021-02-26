package com.ehay.problemsolving.leetcode;

public class Solution1 {
    public boolean twoSumEqualsTarget(int numA, int numB, int resultSum) {
        return numA + numB == resultSum;
    }

    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(twoSumEqualsTarget(nums[i], nums[j], target)) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
