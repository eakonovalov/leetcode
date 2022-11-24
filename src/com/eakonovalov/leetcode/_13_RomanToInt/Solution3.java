package com.eakonovalov.leetcode._13_RomanToInt;

public class Solution3 {

    public static void main(String[] args) {
        System.out.println(new Solution3().romanToInt("XIX"));
        System.out.println(new Solution3().romanToInt("LXIX"));
    }

    private int romanToInt(String s) {
        int result = 0;
        byte[] bytes = s.getBytes();
        for (byte i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            byte next = bytes.length > i + 1 ? bytes[i + 1] : -1;
            if (b == 'I') {
                if (next > 0) {
                    if (next == 'V') {
                        result += 4;
                        i += 1;
                    }
                    else if (next == 'X') {
                        result += 9;
                        i += 1;
                    }
                    else {
                        result += 1;
                    }
                }
                else {
                    result += 1;
                }
            }
            else if (b == 'V') {
                result += 5;
            }
            else if (b == 'X') {
                if (next > 0) {
                    if (next == 'L') {
                        result += 40;
                        i += 1;
                    }
                    else if (next == 'C') {
                        result += 90;
                        i += 1;
                    }
                    else {
                        result += 10;
                    }
                }
                else {
                    result += 10;
                }
            }
            else if (b == 'L') {
                result += 50;
            }
            else if (b == 'C') {
                if (next > 0) {
                    if (next == 'D') {
                        result += 400;
                        i += 1;
                    }
                    else if (next == 'M') {
                        result += 900;
                        i += 1;
                    }
                    else {
                        result += 100;
                    }
                }
                else {
                    result += 100;
                }
            }
            else if (b == 'D') {
                result += 500;
            }
            else if (b == 'M') {
                result += 1000;
            }
        }

        return result;
    }
}
