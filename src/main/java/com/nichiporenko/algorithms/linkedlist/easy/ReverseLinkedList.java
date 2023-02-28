package com.nichiporenko.algorithms.linkedlist.easy;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * Example 2:
 *
 *
 * Input: head = [1,2]
 * Output: [2,1]
 * Example 3:
 *
 * Input: head = []
 * Output: []
 *
 *
 * Constraints:
 *
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000
 */
public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode next = null;
        ListNode previous = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static ListNode reverseListRecursively(ListNode head) {
        return reverse(null, head);
    }

    private static ListNode reverse(ListNode previous, ListNode current) {
        if (current == null) return previous;
        ListNode next = current.next;
        current.next = previous;
        return reverse(current, next);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
