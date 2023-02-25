package com.nichiporenko.algorithms.slidingwindow.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStockTest {

    @Test
    void maxProfit() {
        assertThat(BestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4})).isEqualTo(5);
        assertThat(BestTimeToBuyAndSellStock.maxProfit(new int[]{7, 2, 5, 3, 6, 12})).isEqualTo(10);

        assertThat(BestTimeToBuyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 1})).isEqualTo(0);
        assertThat(BestTimeToBuyAndSellStock.maxProfit(new int[]{2, 1, 1, 1, 1})).isEqualTo(0);
    }
}