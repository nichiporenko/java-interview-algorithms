package com.nichiporenko.algorithms.arrays2d.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxAreaOfIslandTest {

    private final int[][] input1 = {
            {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
            {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
            {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
    };
    private final int[][] input2 = {
            {0, 0, 0, 0, 0, 0, 0, 0}
    };

    @Test
    void maxAreaOfIsland() {
        assertThat(MaxAreaOfIsland.maxAreaOfIsland(input1)).isEqualTo(6);
        assertThat(MaxAreaOfIsland.maxAreaOfIsland(input2)).isEqualTo(0);
    }
}