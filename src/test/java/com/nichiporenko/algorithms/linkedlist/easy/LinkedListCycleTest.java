package com.nichiporenko.algorithms.linkedlist.easy;

import org.junit.jupiter.api.Test;

import static com.nichiporenko.algorithms.linkedlist.easy.LinkedListCycle.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    @Test
    void hasCycle() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2, new ListNode(3, new ListNode(4, node)));

        assertThat(LinkedListCycle.hasCycle(node)).isTrue();
    }

    @Test
    void hasNoCycle() {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        assertThat(LinkedListCycle.hasCycle(node)).isFalse();
    }
}