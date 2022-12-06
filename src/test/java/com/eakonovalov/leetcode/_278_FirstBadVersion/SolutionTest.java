package com.eakonovalov.leetcode._278_FirstBadVersion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void firstBadVersion() {
        boolean[] input = new boolean[]{false, false, false, false, false, false, true, true};
        assertEquals(6, new MySolution(input).firstBadVersion(7));
    }
}