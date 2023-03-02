package com.nichiporenko.algorithms.twopointers.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void isPalindrome() {
        assertThat(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
    }

    @Test
    void isNotPalindrome() {
        assertThat(ValidPalindrome.isPalindrome("raceacar")).isFalse();
    }

    @Test
    void isPalindromeEmpty() {
        assertThat(ValidPalindrome.isPalindrome("")).isTrue();
    }
}