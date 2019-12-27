package com.itisacat.algo.algorithm.reverseLink;

//链表翻转（时间复杂度O(n)，空间复杂度O(1)的做法）
//重点：temp永远指向新排序的末尾，p1永远指向第一个节点，p2在p1的next,p3在p2的next
public class reverseMain {
    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        list.next.next.next.next.next = new ListNode(6);
        list.next.next.next.next.next.next = new ListNode(7);
        printResult(list);
        list = ReverseAlgo.reverse(list);
        printResult(list);
    }

    private static void printResult(ListNode list) {
        do {
            System.out.println(list.val);
            list = list.next;
        } while (list != null);
    }
}
