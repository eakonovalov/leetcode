package com.eakonovalov.leetcode._5_LongestPalindromicSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestPalindrome() {
        assertEquals("bab", new MySolution().longestPalindrome("babad"));
    }
}
