package com.nichiporenko.algorithms.linkedlist.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static com.nichiporenko.algorithms.linkedlist.medium.AddTwoNumbers.ListNode;

class AddTwoNumbersTest {
    private ListNode input1_1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    private ListNode input1_2 = new ListNode(5, new ListNode(6, new ListNode(4)));
    private ListNode input2_1 = new ListNode(0);
    private ListNode input2_2 = new ListNode(0);
    private ListNode input3_1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
            new ListNode(9, new ListNode(9, new ListNode(9)))))));
    private ListNode input3_2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

    @Test
    void add_1() {
        ListNode listNode = AddTwoNumbers.addTwoNumbers(input1_1, input1_2);
        assertThat(listNode.val).isEqualTo(7);
        assertThat(listNode.next.val).isEqualTo(0);
        assertThat(listNode.next.next.val).isEqualTo(8);
    }

    @Test
    void add_2() {
        ListNode listNode = AddTwoNumbers.addTwoNumbers(input2_1, input2_2);
        assertThat(listNode.val).isEqualTo(0);
    }

    @Test
    void add_3() {
        ListNode listNode = AddTwoNumbers.addTwoNumbers(input3_1, input3_2);
        assertThat(listNode.val).isEqualTo(8);
        assertThat(listNode.next.val).isEqualTo(9);
        assertThat(listNode.next.next.val).isEqualTo(9);
        assertThat(listNode.next.next.next.val).isEqualTo(9);
        assertThat(listNode.next.next.next.next.val).isEqualTo(0);
        assertThat(listNode.next.next.next.next.next.val).isEqualTo(0);
        assertThat(listNode.next.next.next.next.next.next.val).isEqualTo(0);
        assertThat(listNode.next.next.next.next.next.next.next.val).isEqualTo(1);
    }
}