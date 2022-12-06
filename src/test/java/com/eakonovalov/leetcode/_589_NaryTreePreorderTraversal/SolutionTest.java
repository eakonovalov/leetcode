package com.eakonovalov.leetcode._589_NaryTreePreorderTraversal;

import com.eakonovalov.leetcode.common.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void preorder() {
        Node root = new Node(1, new ArrayList<>());
        root.children.add(new Node(3, new ArrayList<>()));
        root.children.add(new Node(2));
        root.children.add(new Node(4));
        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));

        assertEquals(of(1, 3, 5, 6, 2, 4), new MySolution().preorder(root));
    }
}
