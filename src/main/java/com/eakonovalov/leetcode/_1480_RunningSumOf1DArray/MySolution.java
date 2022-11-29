package com.eakonovalov.leetcode._1480_RunningSumOf1DArray;

public class MySolution implements Solution {

    @Override
    public int[] runningSum(int[] nums) {
        int runningSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            nums[i] = nums[i] + runningSum;
            runningSum += num;
        }

        return nums;
    }
}
