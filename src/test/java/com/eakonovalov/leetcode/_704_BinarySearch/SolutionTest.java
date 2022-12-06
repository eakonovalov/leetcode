package com.eakonovalov.leetcode._704_BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void search() {
        assertEquals(1, new MySolution().search(new int[]{2, 5}, 5));
        assertEquals(4, new MySolution().search(new int[]{1, 0, 3, 5, 9, 12}, 9));
    }
}
