package com.eakonovalov.leetcode._5_LongestPalindromicSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestPalindrome() {
        assertEquals("bb", new MySolution2().longestPalindrome("cbbd"));
        assertEquals("ccc", new MySolution2().longestPalindrome("ccc"));
        assertEquals("bab", new MySolution2().longestPalindrome("babad"));
        assertEquals("bbb", new MySolution2().longestPalindrome("cbbbd"));
        assertEquals("bb", new MySolution2().longestPalindrome("bb"));
    }
}
