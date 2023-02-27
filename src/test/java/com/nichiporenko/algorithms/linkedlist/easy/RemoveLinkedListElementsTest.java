package com.nichiporenko.algorithms.linkedlist.easy;

import org.junit.jupiter.api.Test;

import static com.nichiporenko.algorithms.linkedlist.easy.RemoveLinkedListElements.ListNode;
import static com.nichiporenko.algorithms.linkedlist.easy.RemoveLinkedListElements.removeElements;
import static org.assertj.core.api.Assertions.assertThat;

class RemoveLinkedListElementsTest {

    @Test
    void removeElement() {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        assertThat(transformResult(removeElements(node, 3))).isEqualTo("1245");
    }

    @Test
    void removeMultipleElements() {
        ListNode node = new ListNode(3, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(3)))));
        assertThat(transformResult(removeElements(node, 3))).isEqualTo("24");
    }

    @Test
    void removeNonExistingElement() {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        assertThat(transformResult(removeElements(node, 10))).isEqualTo("12345");
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