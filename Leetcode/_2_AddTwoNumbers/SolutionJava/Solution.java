package Leetcode._2_AddTwoNumbers.SolutionJava;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp = new ListNode(0);
        ListNode l3 = tmp;
        int carry = 0;
        int l1_val = 0, l2_val = 0;
        ListNode newNode = new ListNode();

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                l1_val = l1.val;
            } else {
                l1_val = 0;
            }
            if (l2 != null) {
                l2_val = l2.val;
            } else {
                l2_val = 0;
            }
            int curr = l1_val + l2_val + carry;
            carry = curr / 10;
            int last_digit = curr % 10;

            newNode = new ListNode(last_digit);
            l3.next = newNode;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if (carry > 0) {
            newNode = new ListNode(carry);
            l3.next = newNode;
            l3 = l3.next;
        }

        return tmp.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;

        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);
        l4.next = l5;
        l5.next = l6;

        Solution addTwoNumbers = new Solution();
        ListNode l7 = addTwoNumbers.addTwoNumbers(l1, l4);
        while (l7 != null) {
            System.out.println(l7.val);
            l7 = l7.next;
        }
    }
}
