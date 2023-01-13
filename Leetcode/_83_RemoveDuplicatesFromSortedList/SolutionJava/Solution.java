package Leetcode._83_RemoveDuplicatesFromSortedList.SolutionJava;

class ListNode {
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

class Solution {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head, prev = head;
        while (temp != null) {
            if (temp.val != prev.val) {
                prev.next = temp;
                prev = temp;
            }
            temp = temp.next;
        }
        if (prev != temp) {
            prev.next = null;
        }

        return head;
    }
}
