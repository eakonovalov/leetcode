package com.eakonovalov.leetcode._98_ValidateBinarySearchTree;

import com.eakonovalov.leetcode.common.TreeNode;

import java.util.*;

public class MySolution implements Solution {

    public boolean isValidBST(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return true;
    }
}
