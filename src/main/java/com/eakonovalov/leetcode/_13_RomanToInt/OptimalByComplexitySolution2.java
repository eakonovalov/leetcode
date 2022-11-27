package com.eakonovalov.leetcode._13_RomanToInt;

public class OptimalByComplexitySolution2 implements Solution {

    public int romanToInt(String s) {
        int n = s.length();
        int result = convert(s.charAt(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            int v = convert(s.charAt(i));
            if (v >= convert(s.charAt(i + 1))) {
                result += v;
            } else {
                result -= v;
            }
        }

        return result;
    }

    private int convert(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
