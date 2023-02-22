package com.nichiporenko.algorithms.arrays.easy;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.nullValue;

class TwoSumTest {

    @Test
    void twoSum() {
        assertThat(IntStream.of(TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9)).boxed().collect(Collectors.toList()),
                containsInAnyOrder(1, 0));
        assertThat(IntStream.of(TwoSum.twoSum(new int[]{3, 2, 4}, 6)).boxed().collect(Collectors.toList()),
                containsInAnyOrder(1, 2));
        assertThat(IntStream.of(TwoSum.twoSum(new int[]{3,3}, 6)).boxed().collect(Collectors.toList()),
                containsInAnyOrder(0, 1));

        assertThat(TwoSum.twoSum(new int[]{2, 7, 11, 15}, 6), nullValue());
        assertThat(TwoSum.twoSum(new int[]{3, 4}, 6), nullValue());
    }
}