package com.eakonovalov.leetcode._7_ReverseInteger;

public class MathSolution implements Solution {

    private static final int MAX = Integer.MAX_VALUE / 10;
    private static final int MIN = Integer.MIN_VALUE / 10;

    public int reverse(int x) {
        if (x == Integer.MIN_VALUE || x == Integer.MAX_VALUE) {
            return 0;
        }
        int reversed = 0;
        while (x != 0) {
            if ((x > 0 && reversed > MAX) || (x < 0 && reversed < MIN)) {
                return 0;
            }
            int remainder = x % 10;
            reversed = reversed * 10;
            if ((x > 0 && Integer.MAX_VALUE - reversed < remainder) || (x < 0 && Integer.MIN_VALUE - reversed > remainder)) {
                return 0;
            }
            reversed += remainder;
            x /= 10;
        }

        return reversed;
    }
}
