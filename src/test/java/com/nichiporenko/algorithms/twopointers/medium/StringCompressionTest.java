package com.nichiporenko.algorithms.twopointers.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

    @Test
    void compress() {
        char[] chars = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        assertThat(StringCompression.compress(chars)).isEqualTo(6);
        assertThat(Arrays.equals(chars, new char[]{'a', '2', 'b', '2', 'c', '3', 'c'})).isTrue();
    }

    @Test
    void compressSingle() {
        char[] chars = new char[]{'a'};
        assertThat(StringCompression.compress(chars)).isEqualTo(1);
        assertThat(Arrays.equals(chars, new char[]{'a'})).isTrue();
    }

    @Test
    void compressLong() {
        char[] chars = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        assertThat(StringCompression.compress(chars)).isEqualTo(4);
        assertThat(Arrays.equals(chars, new char[]{'a', 'b', '1', '2', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'})).isTrue();
    }
}