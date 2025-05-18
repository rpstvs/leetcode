package java.mergeKlists;

public class MergeKSortedLists {
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

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null;

        if (lists == null || lists.length == 0) {
            return null;
        }

        for (ListNode node : lists) {
            res = mergeTwo(res, node);
        }

        return res;
    }

    public ListNode mergeTwo(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }
        if (head1 != null) {
            curr.next = head1;
        } else {
            curr.next = head2;
        }
        return dummy.next;
    }
}
