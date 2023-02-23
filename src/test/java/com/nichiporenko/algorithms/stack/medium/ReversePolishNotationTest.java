package com.nichiporenko.algorithms.stack.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReversePolishNotationTest {

    @Test
    void evalRPN() {
        assertThat(ReversePolishNotation.evalRPN(new String[]{"2","1","+","3","*"})).isEqualTo(9);
        assertThat(ReversePolishNotation.evalRPN(new String[]{"4","13","5","/","+"})).isEqualTo(6);
        assertThat(ReversePolishNotation.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}))
                .isEqualTo(22);
    }
}