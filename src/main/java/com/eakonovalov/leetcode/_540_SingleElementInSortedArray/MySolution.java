package com.eakonovalov.leetcode._540_SingleElementInSortedArray;

public class MySolution implements Solution {

    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int i = 0;
        int j = nums.length;
        while (j - i > 0) {
            int half = i + (j - i) / 2;
            if (half > 0 && nums[half] == nums[half - 1]) {
                half--;
            }
            else if (half == nums.length - 1 || nums[half] != nums[half + 1]) {
                return nums[half];
            }
            if ((j - half) % 2 == 0) {
                j = half;
            }
            else {
                i = half + 2;
            }
        }

        return 0;
    }
}
