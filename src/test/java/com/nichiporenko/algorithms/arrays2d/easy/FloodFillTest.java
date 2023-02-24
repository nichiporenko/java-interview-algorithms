package com.nichiporenko.algorithms.arrays2d.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FloodFillTest {

    private final int[][] input1 = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
    };
    private final int[][] result1 = {
            {2, 2, 2},
            {2, 2, 0},
            {2, 0, 1}
    };
    private final int[][] input2 = {
            {0, 1, 1},
            {0, 1, 0}
    };
    private final int[][] result2 = {
            {0, 2, 2},
            {0, 2, 0}
    };
    private final int[][] input3 = {
            {0, 1, 1},
            {0, 1, 1}
    };
    private final int[][] result3 = {
            {0, 2, 2},
            {0, 2, 2}
    };

    @Test
    void floodFill() {
        assertThat(FloodFill.floodFill(input1, 1, 1, 2)).isDeepEqualTo(result1);
        assertThat(FloodFill.floodFill(input2, 0, 2, 2)).isDeepEqualTo(result2);
        assertThat(FloodFill.floodFill(input3, 1, 2, 2)).isDeepEqualTo(result3);
    }
}