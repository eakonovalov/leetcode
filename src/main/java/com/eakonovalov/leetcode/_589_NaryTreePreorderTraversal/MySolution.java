package com.eakonovalov.leetcode._589_NaryTreePreorderTraversal;

import com.eakonovalov.leetcode.common.Node;

import java.util.*;

public class MySolution implements Solution {

    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node n = stack.poll();
            if (n.children != null) {
                for (int i = n.children.size() - 1; i >= 0; i--) {
                    stack.push(n.children.get(i));
                }
            }
            result.add(n.val);
        }

        return result;
    }
}
