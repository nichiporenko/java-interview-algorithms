package com.nichiporenko.algorithms.sorting.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class QuickSortTest {

    @Test
    void sortArray() {
        assertThat(Arrays.equals(QuickSort.sortArray(new int[]{5, 3, 1, 7, 6}), new int[]{1, 3, 5, 6, 7})).isTrue();
        assertThat(Arrays.equals(QuickSort.sortArray(new int[]{6, 4, 8, 2, 0}), new int[]{0, 2, 4, 6, 8})).isTrue();
    }

    @Test
    void sortArrayWithDuplicates() {
        assertThat(Arrays.equals(QuickSort.sortArray(new int[]{5, 3, 1, 7, 6, 1}), new int[]{1, 1, 3, 5, 6, 7})).isTrue();
        assertThat(Arrays.equals(QuickSort.sortArray(new int[]{6, 4, 4, 8, 2, 0}), new int[]{0, 2, 4, 4, 6, 8})).isTrue();
    }
}