package com.eakonovalov.leetcode._13_RomanToInt;

import java.util.HashMap;
import java.util.Map;

public class OptimalByComplexitySolution implements Solution {

    private static final Map<Character, Integer> ROMAN_MAP = new HashMap<>();

    static {
        ROMAN_MAP.put('I', 1);
        ROMAN_MAP.put('V', 5);
        ROMAN_MAP.put('X', 10);
        ROMAN_MAP.put('L', 50);
        ROMAN_MAP.put('C', 100);
        ROMAN_MAP.put('D', 500);
        ROMAN_MAP.put('M', 1000);
    }

    public int romanToInt(String s) {
        int n = s.length();
        int result = ROMAN_MAP.get(s.charAt(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            int v = ROMAN_MAP.get(s.charAt(i));
            if (v >= ROMAN_MAP.get(s.charAt(i + 1))) {
                result += v;
            } else {
                result -= v;
            }
        }

        return result;
    }
}
