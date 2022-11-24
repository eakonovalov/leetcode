package com.eakonovalov.leetcode._13_RomanToInt;

import java.util.HashMap;
import java.util.Map;

public class OptimalByComplexitySolution {

    private static final Map<Character, Integer> romanMap = new HashMap<>();
    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public static void main(String[] args) {
        System.out.println(new OptimalByComplexitySolution().romanToInt("XIX"));
        System.out.println(new OptimalByComplexitySolution().romanToInt("LXIX"));
    }

    private int romanToInt(String s) {
        int n = s.length();
        int result = romanMap.get(s.charAt(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            int v = romanMap.get(s.charAt(i));
            if (v >= romanMap.get(s.charAt(i + 1))) {
                result += v;
            } else {
                result -= v;
            }
        }

        return result;
    }
}
