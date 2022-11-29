package com.eakonovalov.leetcode._4_MedianOfTwoSortedArrays;

public class MySolution implements Solution {

    @Override
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        boolean isResultEven = (nums1.length + nums2.length) % 2 == 0;
        if (nums1[nums1.length - 1] < nums2[0]) {
            int medianIndex = (nums1.length + nums2.length) / 2 - (isResultEven ? 1 : 0);
            if (isResultEven) {
                return ((double) nums1[medianIndex] + (medianIndex + 1 == nums1.length ? nums2[0] : nums2[medianIndex + 1])) / 2;
            } else {
                return nums1[medianIndex];
            }
        }
        if (nums2[nums2.length - 1] < nums1[0]) {
            int medianIndex = (nums1.length - nums2.length) / 2 - (isResultEven ? 1 : 0);
            if (isResultEven) {
                return ((double) (medianIndex < 0 ? nums2[nums2.length - 1] : nums1[medianIndex]) + nums1[medianIndex + 1]) / 2;
            } else {
                return nums1[medianIndex];
            }
        }

        boolean isEven1 = nums1.length % 2 == 0;
        int i = 0;
        int j = nums1.length;
        double median1;
        int[] median2 = {-1, -1};
        while (j - i > 1) {
            int medianIndex1 = (j + i) / 2 - (isEven1 ? 1 : 0);
            median1 = isEven1 ? ((double) nums1[medianIndex1] + nums1[medianIndex1 + 1]) / 2 : nums1[medianIndex1];
            median2 = findFirstMoreThan(nums2, median1);
            int diff = median2[0] * 2 - nums2.length;
            if (diff < 0) {
                i = medianIndex1;
                j = medianIndex1 - diff;
            } else {
                i = medianIndex1 + diff;
                j = medianIndex1;
            }
        }

        double result;
        if (isResultEven) {
            result = ((double) nums1[j - 1] + (median2[0] == 0 ? median2[1] : nums1[j])) / 2;
        } else {
            result = nums1[j - 1];
        }

        return result;
    }

    public int[] findFirstMoreThan(int[] nums, double value) {
        if (nums[0] > value) {
            return new int[]{0, nums[0]};
        }
        int i = 0;
        int j = nums.length;
        while (j - i > 1) {
            int mid = i + (j - i) / 2;
            if (nums[mid] > value) {
                j = mid;
            } else {
                i = mid;
            }
        }

        return new int[]{j, j < nums.length ? nums[j] : 0};
    }
}
