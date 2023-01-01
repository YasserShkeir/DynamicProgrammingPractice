package Leetcode._21_MergeTwoSortedLists.SolutionJava;

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

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // create a dummy node as the head of the merged list
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        // iterate through both lists
        while (list1 != null && list2 != null) {
            // compare the values of the current nodes
            if (list1.val < list2.val) {
                // add the smaller one to the merged list
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        // add the remaining nodes to the merged list
        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        // return the head of the merged list
        return dummy.next;
    }
}
