package com.nichiporenko.algorithms.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void maxProfit() {
        assertEquals(BestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}), 5);
        assertEquals(BestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 8, 3, 1, 4}), 7);
        assertEquals(BestTimeToBuyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 1}), 0);
    }
}