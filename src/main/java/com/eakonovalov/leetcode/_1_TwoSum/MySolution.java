package com.eakonovalov.leetcode._1_TwoSum;

import java.util.Arrays;
import java.util.Comparator;

public class MySolution implements Solution {

    public int[] twoSum(int[] nums, int target) {
        int[][] sorted = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            sorted[i][0] = nums[i];
            sorted[i][1] = i;
        }
        Arrays.sort(sorted, Comparator.comparingInt(o -> o[0]));
        int[] result = new int[2];
        outer:
        for (int[] ints : sorted) {
            for (int j = sorted.length - 1; j >= 0; j--) {
                int sum = ints[0] + sorted[j][0];
                if (sum == target) {
                    result[0] = ints[1];
                    result[1] = sorted[j][1];
                    return result;
                } else if (sum < target) {
                    continue outer;
                }
            }
        }

        return result;
    }
}
