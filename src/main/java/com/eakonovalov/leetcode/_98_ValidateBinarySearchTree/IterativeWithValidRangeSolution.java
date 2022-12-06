package com.eakonovalov.leetcode._98_ValidateBinarySearchTree;

import com.eakonovalov.leetcode.common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class IterativeWithValidRangeSolution implements Solution {

    private final Deque<TreeNode> stack = new LinkedList<>();
    private final Deque<Integer> los = new LinkedList<>();
    private final Deque<Integer> his = new LinkedList<>();

    @Override
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return false;
        }

        push(root, null, null);
        TreeNode current;
        Integer lo;
        Integer hi;
        while (!stack.isEmpty()) {
            current = stack.pop();
            lo = los.pop();
            hi = his.pop();
            if (lo != null && current.val <= lo) {
                return false;
            }
            if (hi != null && current.val >= hi) {
                return false;
            }
            if (current.left != null) {
                push(current.left, lo, current.val);
            }
            if (current.right != null) {
                push(current.right, current.val, hi);
            }
        }


        return true;
    }

    private void push(TreeNode node, Integer lo, Integer hi) {
        stack.push(node);
        los.push(lo);
        his.push(hi);
    }
}
