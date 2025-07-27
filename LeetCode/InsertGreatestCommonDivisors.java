package LeetCode;

public class InsertGreatestCommonDivisors {
    public ListNode insertGreatestCommonDivisors(ListNode head) { // TODO
        return new ListNode();
    }

    private void recursive(ListNode node) {
        int gcd;
        int left = node.val;
        int right = node.next.val;
        while (left != 0 || right != 0) {
            left = node.val;
            right = node.next.val;
            // left 
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
