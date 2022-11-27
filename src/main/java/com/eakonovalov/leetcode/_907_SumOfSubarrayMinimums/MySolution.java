package com.eakonovalov.leetcode._907_SumOfSubarrayMinimums;

public class MySolution implements Solution{

    public int sumSubarrayMins(int[] arr) {
        long result = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    n++;
                } else {
                    break;
                }
            }
            int k = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= arr[i]) {
                    k += n;
                } else {
                    break;
                }
            }
            n += k;
            result += (long) n * arr[i];
        }

        return (int) (result % 1000000007);
    }
}
