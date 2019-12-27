package com.itisacat.algo.algorithm.reverseLink;

public class ReverseAlgo {
    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int len = 0;
        ListNode next = head;
        while (next != null) {
            len++;
            next = next.next;
        }
        if (len == 1) {
            return head;
        }
        if (len == 2) {
            ListNode newList = head.next;
            head.next = null;
            newList.next = head;
            return newList;
        }
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode p1 = head;
        ListNode p2 = p1.next;
        ListNode p3 = p2.next;
        do {
            p1.next = p3;
            p2.next = temp.next;
            temp.next = p2;
            p2 = p3;
            if (p2 != null) {
                p3 = p2.next;
            }
        } while (p2 != null);
        return temp.next;
    }
}
