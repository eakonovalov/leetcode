package com.eakonovalov.leetcode._278_FirstBadVersion;

public class MySolution implements Solution {

    private final boolean[] input;

    public MySolution(boolean[] input) {
        this.input = input;
    }

    boolean isBadVersion(int version) {
        return input[version];
    }

    public int firstBadVersion(int n) {
        if (n == 0) {
            return n;
        }

        int i = 0;
        int j = n;
        while (j - i > 1) {
            int mid = (j - i) / 2 + i;
            if (isBadVersion(mid)) {
                j = mid;
            }
            else {
                i = mid;
            }
        }

        return isBadVersion(j) ? j : i;
    }
}
