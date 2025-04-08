class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        // Dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int n = getLength(head);

        // Pointers to previous nodes
        ListNode prev1 = dummy, prev2 = dummy;

        // Find prev1 (before k-th from start)
        for (int i = 1; i < k; i++) {
            prev1 = prev1.next;
        }

        // Find prev2 (before k-th from end)
        for (int i = 1; i < n - k + 1; i++) {
            prev2 = prev2.next;
        }

        // Nodes to swap
        ListNode node1 = prev1.next;
        ListNode node2 = prev2.next;

        // If same node, no need to swap
        if (node1 == node2) return head;

        // Handle adjacent nodes
        if (prev1.next == prev2) {
            // Ensure node1 comes before node2
            ListNode temp = node1; node1 = node2; node2 = temp;
            ListNode tempPrev = prev1; prev1 = prev2; prev2 = tempPrev;
        }

        if (prev1.next == node1 && node1.next == node2) {
            // Adjacent node1 -> node2
            node1.next = node2.next;
            node2.next = node1;
            prev1.next = node2;
        } else if (prev2.next == node2 && node2.next == node1) {
            // Adjacent node2 -> node1
            node2.next = node1.next;
            node1.next = node2;
            prev2.next = node1;
        } else {
            // General swap
            ListNode temp = node1.next;
            prev1.next = node2;
            node1.next = node2.next;

            prev2.next = node1;
            node2.next = temp;
        }

        return dummy.next;
    }

    private int getLength(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
