package com.eakonovalov.leetcode._409_LongestPalindrome;

import java.util.HashMap;
import java.util.Map;

public class MySolution implements Solution {

    public int longestPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer n = map.get(c);
            map.put(c, n != null ? ++n : 1);
        }
        int result = 0;
        boolean hasSingle = false;
        for (Integer n : map.values()) {
            int reminder = n % 2;
            hasSingle = hasSingle || reminder > 0;
            result += n - reminder;
        }
        if (hasSingle) {
            result++;
        }

        return result;
    }
}
