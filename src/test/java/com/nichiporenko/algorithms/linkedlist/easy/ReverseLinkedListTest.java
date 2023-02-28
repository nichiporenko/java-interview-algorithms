package com.nichiporenko.algorithms.linkedlist.easy;

import org.junit.jupiter.api.Test;

import static com.nichiporenko.algorithms.linkedlist.easy.ReverseLinkedList.*;
import static org.assertj.core.api.Assertions.assertThat;

class ReverseLinkedListTest {

    @Test
    void reverse() {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        assertThat(transformResult(reverseList(node))).isEqualTo("54321");
    }

    @Test
    void reverseShort() {
        ListNode node = new ListNode(1, new ListNode(2));
        assertThat(transformResult(reverseList(node))).isEqualTo("21");
    }

    @Test
    void reverseLong() {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,
                new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(9)))))))));
        assertThat(transformResult(reverseList(node))).isEqualTo("987654321");
    }

    @Test
    void reverseRecursively() {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        assertThat(transformResult(reverseListRecursively(node))).isEqualTo("54321");
    }

    @Test
    void reverseRecursivelyShort() {
        ListNode node = new ListNode(1, new ListNode(2));
        assertThat(transformResult(reverseListRecursively(node))).isEqualTo("21");
    }

    @Test
    void reverseRecursivelyLong() {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,
                new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(9)))))))));
        assertThat(transformResult(reverseListRecursively(node))).isEqualTo("987654321");
    }

    private String transformResult(ListNode node) {
        ListNode current = node;
        StringBuilder result = new StringBuilder();

        while (current != null) {
            result.append(current.val);
            current = current.next;
        }
        return result.toString();
    }
}