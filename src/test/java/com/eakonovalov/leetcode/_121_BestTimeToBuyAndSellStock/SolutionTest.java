package com.eakonovalov.leetcode._121_BestTimeToBuyAndSellStock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProfit() {
        assertEquals(5, new MySolution().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(2, new MySolution().maxProfit(new int[]{2, 4, 1}));
        assertEquals(2, new MySolution().maxProfit(new int[]{2, 1, 2, 1, 0, 1, 2}));
        assertEquals(3, new MySolution().maxProfit(new int[]{1, 2, 3, 4, 0, 2}));
    }
}