package com.nichiporenko.algorithms.stack.medium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinStackTest {
    private static MinStack stack;

    @BeforeAll
    static void setup() {
        stack = new MinStack();
    }

    @Test
    void test() {
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(1);

        assertThat(stack.getMin()).isEqualTo(1);
        assertThat(stack.top()).isEqualTo(1);
        stack.pop();
        assertThat(stack.getMin()).isEqualTo(2);
        assertThat(stack.top()).isEqualTo(4);
        stack.pop();
        assertThat(stack.getMin()).isEqualTo(2);
        assertThat(stack.top()).isEqualTo(2);
        stack.pop();
        assertThat(stack.getMin()).isEqualTo(3);
        assertThat(stack.top()).isEqualTo(3);
    }
}