package io.github.ihaohong.solutions.s206;

public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reverseList = new Solution().reverseList(head);

        printList(reverseList);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next != null) {
            ListNode reverseHead  = reverseList(head.next);
            ListNode currentNode = reverseHead;
            while (currentNode.next != null) currentNode = currentNode.next;
            currentNode.next = new ListNode(head.val);
            return reverseHead;
        } else {
            return new ListNode(head.val);
        }
    }

    private static void printList(ListNode head) {
        while (head.next != null) {
            System.out.println(head.val);

            head = head.next;
        }
        System.out.println(head.val);
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}