package com.nichiporenko.algorithms.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ContainsDuplicateTest {

    @Test
    public void containsDuplicate() {
        assertTrue(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}));
        assertTrue(ContainsDuplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));

        assertFalse(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4}));
        assertFalse(ContainsDuplicate.containsDuplicate(new int[]{1, 4, 6, 7, 12, 14, 16, 17}));
    }

}