package com.eakonovalov.leetcode._907_SumOfSubarrayMinimums;

import java.util.Stack;

public class OptimalSolution implements Solution {

    public int sumSubarrayMins(int[] arr) {
        int MOD = 1000000007;

        Stack<Integer> stack = new Stack<>();
        long sumOfMinimums = 0;

        for (int i = 0; i <= arr.length; i++) {
            while (!stack.empty() && (i == arr.length || arr[stack.peek()] >= arr[i])) {
                int mid = stack.pop();
                int leftBoundary = stack.empty() ? -1 : stack.peek();
                int count = (mid - leftBoundary) * (i - mid) % MOD;
                sumOfMinimums += ((long) count * arr[mid]) % MOD;
                sumOfMinimums %= MOD;
            }
            stack.push(i);
        }

        return (int) (sumOfMinimums);
    }
}
