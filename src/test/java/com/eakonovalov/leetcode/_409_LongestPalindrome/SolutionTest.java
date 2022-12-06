package com.eakonovalov.leetcode._409_LongestPalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestPalindrome() {
        assertEquals(7, new MySolution2().longestPalindrome("abccccdd"));
    }
}