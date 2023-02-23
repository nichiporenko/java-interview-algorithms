package com.nichiporenko.algorithms.binarysearch.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void search() {
        assertThat(BinarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 9)).isEqualTo(4);
        assertThat(BinarySearch.search(new int[]{3, 6, 8, 9, 12, 13, 14}, 13)).isEqualTo(5);
        assertThat(BinarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2)).isEqualTo(-1);
    }
}