package com.eakonovalov.leetcode._9_PalindromeNumber;

public class StringSolution implements Solution {

    public boolean isPalindrome(int x) {
        String original = String.valueOf(x);
        StringBuilder reversed = new StringBuilder(original);

        return original.equals(reversed.reverse().toString());
    }
}
