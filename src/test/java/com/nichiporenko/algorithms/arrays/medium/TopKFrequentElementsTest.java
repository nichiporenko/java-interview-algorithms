package com.nichiporenko.algorithms.arrays.medium;

import com.nichiporenko.algorithms.arrays.easy.TwoSum;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    @Test
    void topKFrequent() {
        assertThat(IntStream.of(TopKFrequentElements.topKFrequent(new int[] {1,1,1,2,2,3}, 2)).boxed().collect(Collectors.toList()),
                containsInAnyOrder(1, 2));
        assertThat(IntStream.of(TopKFrequentElements.topKFrequent(new int[] {1}, 1)).boxed().collect(Collectors.toList()),
                containsInAnyOrder(1));
        assertThat(IntStream.of(TopKFrequentElements.topKFrequent(new int[]{0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, 2)).boxed().collect(Collectors.toList()),
                containsInAnyOrder(1, 3));
    }
}