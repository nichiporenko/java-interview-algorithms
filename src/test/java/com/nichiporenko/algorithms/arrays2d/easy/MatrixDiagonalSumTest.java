package com.nichiporenko.algorithms.arrays2d.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MatrixDiagonalSumTest {
    private final int[][] input1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    private final int[][] input2 = {
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1}
    };
    private final int[][] input3 = {
            {5}
    };

    @Test
    void diagonalSum() {
        assertThat(MatrixDiagonalSum.diagonalSum(input1)).isEqualTo(25);
        assertThat(MatrixDiagonalSum.diagonalSum(input2)).isEqualTo(8);
        assertThat(MatrixDiagonalSum.diagonalSum(input3)).isEqualTo(5);
    }


}