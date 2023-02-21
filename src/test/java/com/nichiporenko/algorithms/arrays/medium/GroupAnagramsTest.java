package com.nichiporenko.algorithms.arrays.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

class GroupAnagramsTest {

    @Test
    void groupAnagrams() {
        assertThat(GroupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}),
                containsInAnyOrder(List.of("bat"), List.of("tan", "nat"), List.of("eat", "tea", "ate")));
        assertThat(GroupAnagrams.groupAnagrams(new String[]{""}),
                containsInAnyOrder(List.of("")));
        assertThat(GroupAnagrams.groupAnagrams(new String[]{"a"}),
                containsInAnyOrder(List.of("a")));
    }
}