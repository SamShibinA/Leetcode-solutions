class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode tem=head,first=head,second=head;
        int n=getLength(tem);
        
        for(int i=1;i<k;i++)first=first.next;

        for(int i=1;i<n-k+1;i++)second=second.next;

        int temp=first.val;
        first.val=second.val;
        second.val=temp;

        return head;

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
