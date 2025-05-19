package java.SwapNodesInPairs;

import java.util.List;

public class SwapNodesInPairs {
    public class ListNode {
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

    public ListNode swapPairs(ListNode head) {
        /*
         * curr -> curr.next -> next.next
         */
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode previouNode = dummy;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            ListNode nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = curr;
            previouNode.next = nextNode;

            previouNode = curr;
            curr = curr.next;
        }

        return dummy.next;
    }
}
