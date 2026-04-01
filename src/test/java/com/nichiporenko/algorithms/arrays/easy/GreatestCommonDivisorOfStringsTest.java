package com.nichiporenko.algorithms.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorOfStringsTest {

    @Test
    public void gcdOfStrings() {
        assertEquals("ABC", GreatestCommonDivisorOfStrings.gcdOfStrings("ABCABC", "ABC"));
        assertEquals("AB", GreatestCommonDivisorOfStrings.gcdOfStrings("ABABAB", "ABAB"));
        assertEquals("", GreatestCommonDivisorOfStrings.gcdOfStrings("LEET", "CODE"));
        assertEquals("", GreatestCommonDivisorOfStrings.gcdOfStrings("AAAAAB", "AAA"));
    }
}