/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||head.next==null||left==right) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode pre=dummy;

        for(int i=1;i<left;i++){
            pre=pre.next;
        }

        ListNode start=pre.next;

        ListNode ans=reverse(start,right-left+1);

        pre.next=ans;

        return dummy.next;

    }

    public ListNode reverse(ListNode head,int range){
        ListNode pre=null;
        ListNode curr=head;
        while(range-->0&&curr!=null){
            ListNode tem=curr.next;
            curr.next=pre;
            pre=curr;
            curr=tem;
        }
        head.next=curr;
        return pre;
    }
}