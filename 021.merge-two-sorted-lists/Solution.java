import java.util.Stack;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mergedHead = new ListNode(-2);
        ListNode mergedCurrent = mergedHead;

        while (l1 != null || l2 != null) {
            if (l1 == null && l2 != null) {
//                System.out.println("l2 " + l2.val);
                mergedCurrent.next = l2;
                l2 = l2.next;
            } else if (l2 == null && l1 != null) {
//                System.out.println("l1 " + l1.val);
                mergedCurrent.next = l1;
                l1 = l1.next;
            } else if (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
//                    System.out.println("l1 " + l1.val);
                    mergedCurrent.next = l1;
                    l1 = l1.next;
                } else {
//                    System.out.println("l2 " + l2.val);
                    mergedCurrent.next = l2;
                    l2 = l2.next;
                }
            } else {
//                System.out.println("error");
            }

            mergedCurrent = mergedCurrent.next;
        }

        return mergedHead.next;
    }

    public void displayList(ListNode headNode) {
        System.out.print("List: ");

        while (headNode != null) {
            this.displayNode(headNode);
            headNode = headNode.next;
        }

        System.out.println();
    }

    public void displayNode(ListNode node) {
        System.out.print(node.val + " ");
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode AHead = new ListNode(-1);
        ListNode BHead = new ListNode(-1);

        ListNode ACurrent = AHead;
        ListNode BCurrent = BHead;

        for (int i = 0; i < 6; i++) {
            ListNode newANode = new ListNode(i * 5);
            ACurrent.next = newANode;
            ACurrent = newANode;

            ListNode newBNode = new ListNode(i * 8);
            BCurrent.next = newBNode;
            BCurrent = newBNode;
        }

        s.displayList(AHead);
        s.displayList(BHead);

        s.displayList(
                s.mergeTwoLists(AHead, BHead)
        );

//        System.out.println("end");
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}