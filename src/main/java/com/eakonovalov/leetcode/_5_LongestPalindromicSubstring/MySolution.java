package com.eakonovalov.leetcode._5_LongestPalindromicSubstring;

public class MySolution implements Solution {

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) {
            return s;
        }
        if (s.length() == 2) {
            return s.charAt(0) == s.charAt(1) ? s : String.valueOf(s.charAt(0));
        }

        int mid = s.length() / 2;

        return s;
    }
}
