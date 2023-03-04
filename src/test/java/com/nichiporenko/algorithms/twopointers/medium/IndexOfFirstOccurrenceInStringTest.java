package com.nichiporenko.algorithms.twopointers.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IndexOfFirstOccurrenceInStringTest {

    @Test
    void find() {
        assertThat(IndexOfFirstOccurrenceInString.find("sadbutsad", "sad")).isEqualTo(0);
    }

    @Test
    void findNotExisting() {
        assertThat(IndexOfFirstOccurrenceInString.find("leetcode", "leeto")).isEqualTo(-1);
    }

    @Test
    void findLong() {
        assertThat(IndexOfFirstOccurrenceInString.find("daaaswwndlaodnfwwnfvbbyeovaswnslsknojasdfwwvnfjfvuvnov",
                "fwwvn")).isEqualTo(40);
    }
}