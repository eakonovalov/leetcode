package com.eakonovalov.leetcode._5_LongestPalindromicSubstring;

public class MySolution2 implements Solution {
    @Override
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) {
            return s;
        }
        if (s.length() == 2) {
            return s.charAt(0) == s.charAt(1) ? s : String.valueOf(s.charAt(0));
        }

        int start = 0;
        int length = 1;
        for (int k = 1; k < s.length() - 1; k++) {
            int i = k - 1;
            int j = k + 1;
            while (i > 1 && j < s.length() - 2 && s.charAt(i - 1) == s.charAt(j + 1)) {
                i--;
                j++;
            };
            int l = j - i + 1;
            if (length < l) {
                start = i;
                length = l;
            }
            if (k + 2 < s.length() && s.charAt(k) == s.charAt(k + 1)) {
                i = k - 1;
                j = k + 2;
                while (i > 1 && j < s.length() - 2 && s.charAt(i - 1) == s.charAt(j + 1)) {
                    i--;
                    j++;
                };
                l = j - i + 1;
                if (length < l) {
                    start = i;
                    length = l;
                }
            }
        }

        return s.substring(start, start + length);
    }
}
