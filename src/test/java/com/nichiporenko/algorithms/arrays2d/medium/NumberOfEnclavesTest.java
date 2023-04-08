package com.nichiporenko.algorithms.arrays2d.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfEnclavesTest {

    private final int[][] input1 = {
            {0, 0, 0, 0},
            {1, 0, 1, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 0}
    };
    private final int[][] input2 = {
            {0, 1, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 0}
    };
    @Test
    void numEnclaves() {
        assertThat(NumberOfEnclaves.count(input1)).isEqualTo(3);
        assertThat(NumberOfEnclaves.count(input2)).isEqualTo(0);
    }
}