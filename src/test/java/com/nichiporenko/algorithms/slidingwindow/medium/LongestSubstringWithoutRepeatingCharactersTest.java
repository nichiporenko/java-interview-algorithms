package com.nichiporenko.algorithms.slidingwindow.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void lengthOfLongestSubstring() {
        assertThat(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb")).isEqualTo(3);
        assertThat(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbb")).isEqualTo(1);
        assertThat(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("fdsfawrcejlusna")).isEqualTo(11);
        assertThat(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("fdswcfsghj")).isEqualTo(7);
        assertThat(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("fdswcfsghjt")).isEqualTo(8);
    }
}