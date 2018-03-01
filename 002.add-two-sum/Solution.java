/**
 * @author haohong
 */
public class Solution {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        int newVal = l1.val + l2.val;
        if (newVal >= 10) {
            newVal = newVal % 10;
            carry = 1;
        }
        ListNode result = new ListNode(newVal);
        ListNode resultIterator = result;

        while (l1.next != null || l2.next != null || carry == 1) {
            if (l1.next != null && l2.next != null) {
                l1 = l1.next;
                l2 = l2.next;

                newVal = l1.val + l2.val + carry;
            } else if (l1.next == null && l2.next != null) {
                l2 = l2.next;
                newVal = l2.val + carry;
            } else if (l1.next != null && l2.next == null) {
                l1 = l1.next;
                newVal = l1.val + carry;
            } else { // 只有进位的情况
                newVal = carry;
            }

            if (newVal >= 10) {
                newVal = newVal % 10;
                carry = 1;
            } else {
                carry = 0;
            }

            resultIterator.next = new ListNode(newVal);
            resultIterator = resultIterator.next;

        }

        return result;
    }

    private static void printList(ListNode list) {
        System.out.print("(");
        System.out.print(list.val + ",");

        while (list.next != null) {
            list = list.next;
            System.out.print(list.val);
            System.out.print(",");
        }
        System.out.print(")");
    }

    private void p(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        solution.test1();
//        solution.test2();
//        solution.test3();
        solution.test4();
    }

    public static void test4() {
        Solution solution = new Solution();

        ListNode l1 = new Solution().new ListNode(8);
        l1.next = new Solution().new ListNode(9);
        l1.next.next = new Solution().new ListNode(9);

        ListNode l2 = new Solution().new ListNode(2);

        ListNode result = solution.addTwoNumbers(l1, l2);
        Solution.printList(result);
    }

    public static void test3() {
        Solution solution = new Solution();

        ListNode l1 = new Solution().new ListNode(5);

        ListNode l2 = new Solution().new ListNode(5);

        ListNode result = solution.addTwoNumbers(l1, l2);
        Solution.printList(result);
    }

    public static void test2() {
        Solution solution = new Solution();

        ListNode l1 = new Solution().new ListNode(1);
        l1.next = new Solution().new ListNode(8);

        ListNode l2 = new Solution().new ListNode(0);

        ListNode result = solution.addTwoNumbers(l1, l2);
        Solution.printList(result);
    }

    public static void test1() {
        Solution solution = new Solution();

        ListNode l1 = new Solution().new ListNode(2);
        l1.next = new Solution().new ListNode(4);
        l1.next.next = new Solution().new ListNode(3);

        ListNode l2 = new Solution().new ListNode(5);
        l2.next = new Solution().new ListNode(6);
        l2.next.next = new Solution().new ListNode(4);

        ListNode result = solution.addTwoNumbers(l1, l2);
        Solution.printList(result);
    }
}
