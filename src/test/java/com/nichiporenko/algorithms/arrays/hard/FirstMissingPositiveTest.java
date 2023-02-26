package com.nichiporenko.algorithms.arrays.hard;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FirstMissingPositiveTest {

    @Test
    void firstMissingPositive() {
        assertThat(FirstMissingPositive.find(new int[]{1, 2, 0})).isEqualTo(3);
        assertThat(FirstMissingPositive.find(new int[]{3, 4, -1, 1})).isEqualTo(2);
        assertThat(FirstMissingPositive.find(new int[]{7, 8, 9, 11, 12})).isEqualTo(1);
    }
}