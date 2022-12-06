package com.eakonovalov.leetcode._5_LongestPalindromicSubstring;

public class MySolution implements Solution {

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) {
            return s;
        }
        if (s.length() == 2) {
            return s.charAt(0) == s.charAt(1) ? s : String.valueOf(s.charAt(0));
        }

        int[] maxPalindromeIndexAndLength = {0, 0};
        int mid = s.length() / 2;
        int radius = 0;

        while (mid - radius > 0) {
            int index = mid - radius;
            updatePalindromeIndexAndLength(s, index - 1, index + 1, maxPalindromeIndexAndLength);
            if (index < s.length() && s.charAt(index) == s.charAt(index + 1)) {
                updatePalindromeIndexAndLength(s, index - 1, index + 2, maxPalindromeIndexAndLength);
            }
            if (index != (mid + radius)) {
                index = mid + radius;
                updatePalindromeIndexAndLength(s, index - 1, index + 1, maxPalindromeIndexAndLength);
                if (index < s.length() - 1 && s.charAt(index) == s.charAt(index + 1)) {
                    updatePalindromeIndexAndLength(s, index - 1, index + 2, maxPalindromeIndexAndLength);
                }
            }
            radius++;
        }

        return s.substring(maxPalindromeIndexAndLength[0], maxPalindromeIndexAndLength[0] + maxPalindromeIndexAndLength[1]);
    }

    private void updatePalindromeIndexAndLength(String s, int i, int j, int[] maxPalindromeIndexAndLength) {
        while (i > 0 && j < s.length() &&  s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        if (maxPalindromeIndexAndLength[1] < j - i - 1) {
            maxPalindromeIndexAndLength[0] = i + 1;
            maxPalindromeIndexAndLength[1] = j - i - 1;
        }
    }
}
