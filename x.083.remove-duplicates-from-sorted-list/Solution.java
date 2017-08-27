class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        if (current == null) {
            return current;
        }

        if (current.next == null) {
            return current;
        }

        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            }

            current = current.next;
        }

        return head;
    }

    public void printListNode(ListNode head) {
        if (head == null) {
            return;
        }

        System.out.println(head.val);

        if (head.next != null) {
            this.printListNode(head.next);
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(4);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(5);

        Solution s = new Solution();
        s.printListNode(head);

        ListNode result = s.deleteDuplicates(head);
        s.printListNode(result);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}