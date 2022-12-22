package Leetcode._141_LinkedListCycle.SolutionJava;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

/*
 * The Solution consists of a fast pointer, and a slow pointer.
 * The fast pointer moves two steps at a time, while the slow pointer moves one
 * step at a time.
 * If there is a cycle, the fast pointer will eventually meet the slow pointer.
 * If there is no cycle, the fast pointer will eventually reach the end of the
 * list.
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }
}