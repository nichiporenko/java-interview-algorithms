package com.nichiporenko.algorithms.stack.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {

    @Test
    void isValid() {
        assertTrue(ValidParentheses.isValid("()"));
        assertTrue(ValidParentheses.isValid("()[]{}"));
        assertTrue(ValidParentheses.isValid("()([])({}{})"));

        assertFalse(ValidParentheses.isValid("[}"));
        assertFalse(ValidParentheses.isValid("[]]"));
        assertFalse(ValidParentheses.isValid("[{]}"));
    }
}