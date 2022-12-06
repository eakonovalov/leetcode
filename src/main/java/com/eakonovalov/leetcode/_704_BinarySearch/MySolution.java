package com.eakonovalov.leetcode._704_BinarySearch;

public class MySolution implements Solution {

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int i = 0;
        int j = nums.length - 1;
        while (j - i > 1) {
            int mid = (j - i) / 2 + i;
            if (nums[mid] > target) {
                j = mid;
            }
            else {
                if (nums[mid] == target) {
                    return mid;
                }
                i = mid;
            }
        }

        return nums[i] == target ? i : nums[j] == target ? j : -1;
    }
}
