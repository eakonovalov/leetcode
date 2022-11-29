package com.eakonovalov.leetcode._724_FindPivotIndex;

public class MySolution implements Solution {

    @Override
    public int pivotIndex(int[] nums) {
        long leftSum = 0;
        long rightSum = 0;
        for (int i = nums.length - 1; i >= 1; i--) {
            rightSum += nums[i];
        }
        if (leftSum == rightSum) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            leftSum += nums[i - 1];
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}
