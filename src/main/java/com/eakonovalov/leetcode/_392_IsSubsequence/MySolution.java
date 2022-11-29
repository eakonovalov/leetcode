package com.eakonovalov.leetcode._392_IsSubsequence;

public class MySolution implements Solution {

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        int sl = s.length();
        int tl = t.length();
        int pos = 0;
        char next = s.charAt(pos);
        for (int i = 0; i < tl; i++) {
            if (next == t.charAt(i)) {
                pos++;
                if (pos == sl) {
                    return true;
                }
                next = s.charAt(pos);
            }
        }

        return false;
    }
}
