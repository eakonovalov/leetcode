package com.eakonovalov.leetcode._4_MedianOfTwoSortedArrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final List<Solution> solutions = new ArrayList<>();

    @BeforeEach
    void beforeEach() {
        solutions.add(new MySolution());
    }

    @Test
    void findMedianSortedArrays() {
        int[] nums11 = {1, 2};
        int[] nums21 = {3, 4};

        int[] nums12 = {1, 3};
        int[] nums22 = {2};

        int[] nums13 = {1, 3, 4, 5, 7};
        int[] nums23 = {2, 6, 8};

        int[] nums14 = {1, 3, 4, 5, 7};
        int[] nums24 = {2, 6, 8, 9};

        for (Solution solution : solutions) {
            assertEquals(2.5, solution.findMedianSortedArrays(nums11, nums21));
            assertEquals(2, solution.findMedianSortedArrays(nums12, nums22));
            assertEquals(4.5, solution.findMedianSortedArrays(nums13, nums23));
            assertEquals(5, solution.findMedianSortedArrays(nums14, nums24));
        }
    }

    @Test
    void findFirstMoreThan() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(new int[] {4, 5}, new MySolution().findFirstMoreThan(nums, 4));
        int[] nums2 = {1, 2, 3, 4, 6, 7, 8, 9, 10, 12, 13, 14, 15};
        assertArrayEquals(new int[] {7, 9}, new MySolution().findFirstMoreThan(nums2, 8));
        assertArrayEquals(new int[] {0, 1}, new MySolution().findFirstMoreThan(nums2, 0));
        assertArrayEquals(new int[] {1, 2}, new MySolution().findFirstMoreThan(nums2, 1));
        assertArrayEquals(new int[] {13, 0}, new MySolution().findFirstMoreThan(nums2, 16));
        int[] nums3 = {-5, -2, 0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 12, 13, 14, 15};
        assertArrayEquals(new int[] {1, -2}, new MySolution().findFirstMoreThan(nums3, -5));
        assertArrayEquals(new int[] {0, -5}, new MySolution().findFirstMoreThan(nums3, -6));
        assertArrayEquals(new int[] {1, -2}, new MySolution().findFirstMoreThan(nums3, -4));
        assertArrayEquals(new int[] {15, 15}, new MySolution().findFirstMoreThan(nums3, 14));
        assertArrayEquals(new int[] {16, 0}, new MySolution().findFirstMoreThan(nums3, 15));
        assertArrayEquals(new int[] {16, 0}, new MySolution().findFirstMoreThan(nums3, 50));
    }
}