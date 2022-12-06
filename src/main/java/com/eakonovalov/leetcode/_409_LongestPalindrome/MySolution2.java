package com.eakonovalov.leetcode._409_LongestPalindrome;

public class MySolution2 implements Solution {

    @Override
    public int longestPalindrome(String s) {
        char[] m = new char[74];
        for (int i = 0; i < s.length(); i++) {
            m[s.charAt(i) - 49] += 1;
        }
        int result = 0;
        boolean hasSingle = false;
        for (char j : m) {
            int reminder = j % 2;
            hasSingle = hasSingle || reminder > 0;
            result += j - reminder;
        }
        if (hasSingle) {
            result++;
        }

        return result;
    }
}
