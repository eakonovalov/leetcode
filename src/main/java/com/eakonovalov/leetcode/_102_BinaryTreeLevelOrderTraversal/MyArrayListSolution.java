package com.eakonovalov.leetcode._102_BinaryTreeLevelOrderTraversal;

import com.eakonovalov.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListSolution implements Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        List<Integer> values = new ArrayList<>();
        values.add(root.val);
        result.add(values);

        List<TreeNode> level = new ArrayList<>();
        level.add(root);

        while ((level = nextLevel(level)).size() != 0) {
            values = new ArrayList<>();
            for (TreeNode n : level) {
                values.add(n.val);
            }
            result.add(values);
        }


        return result;
    }

    private List<TreeNode> nextLevel(List<TreeNode> level) {
        List<TreeNode> next = new ArrayList<>();
        for (TreeNode node : level) {
            if (node.left != null) {
                next.add(node.left);
            }
            if (node.right != null) {
                next.add(node.right);
            }
        }

        return next;
    }
}
