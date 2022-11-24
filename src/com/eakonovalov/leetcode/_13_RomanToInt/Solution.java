package com.eakonovalov.leetcode._13_RomanToInt;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("XIX"));
        System.out.println(new Solution().romanToInt("LXIX"));
    }

    private int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'I') {
                char n;
                if (s.length() > i + 1 && ((n = s.charAt(i + 1)) == 'V' || n == 'X')) {
                    if (n == 'V') {
                        result += 4;
                    }
                    else {
                        result += 9;
                    }
                    i += 1;
                }
                else {
                    result += 1;
                }
            }
            else if (c == 'V') {
                result += 5;
            }
            else if (c == 'X') {
                char n;
                if (s.length() > i + 1 && ((n = s.charAt(i + 1)) == 'L' || n == 'C')) {
                    if (n == 'L') {
                        result += 40;
                    }
                    else {
                        result += 90;
                    }
                    i += 1;
                }
                else {
                    result += 10;
                }
            }
            else if (c == 'L') {
                result += 50;
            }
            else if (c == 'C') {
                char n;
                if (s.length() > i + 1 && ((n = s.charAt(i + 1)) == 'D' || n == 'M')) {
                    if (n == 'D') {
                        result += 400;
                    }
                    else {
                        result += 900;
                    }
                    i += 1;
                }
                else {
                    result += 100;
                }
            }
            else if (c == 'D') {
                result += 500;
            }
            else if (c == 'M') {
                result += 1000;
            }
        }

        return result;
    }
}
