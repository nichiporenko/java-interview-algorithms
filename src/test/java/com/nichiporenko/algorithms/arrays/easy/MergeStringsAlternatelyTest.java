package com.nichiporenko.algorithms.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {

    @Test
    public void mergeAlternately() {
        assertEquals("apbqcr", MergeStringsAlternately.mergeAlternately("abc", "pqr"));
        assertEquals("apbqrs", MergeStringsAlternately.mergeAlternately("ab", "pqrs"));
        assertEquals("apbqcd", MergeStringsAlternately.mergeAlternately("abcd", "pq"));
    }
}