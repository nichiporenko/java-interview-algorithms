package com.nichiporenko.algorithms.slidingwindow.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PermutationInStringTest {

    @Test
    void checkInclusion() {
        assertThat(PermutationInString.checkInclusion("ab", "eidbaooo")).isTrue();
        assertThat(PermutationInString.checkInclusion("foj", "ajsdjgasdjfoasdjfasjioiewjr")).isTrue();
        assertThat(PermutationInString.checkInclusion("foo", "woironvweofo")).isTrue();
        assertThat(PermutationInString.checkInclusion("ldm", "lksfosdfosdmfo")).isFalse();
        assertThat(PermutationInString.checkInclusion("ab", "eidboaoo")).isFalse();
    }
}