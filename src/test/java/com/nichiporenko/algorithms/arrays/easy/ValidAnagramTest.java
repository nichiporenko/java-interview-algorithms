package com.nichiporenko.algorithms.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void isAnagram() {
        assertTrue(ValidAnagram.isAnagram("anagram", "nagaram"));
        assertTrue(ValidAnagram.isAnagram("test", "sett"));

        assertFalse(ValidAnagram.isAnagram("rat", "car"));
        assertFalse(ValidAnagram.isAnagram("first", "second"));
    }
}