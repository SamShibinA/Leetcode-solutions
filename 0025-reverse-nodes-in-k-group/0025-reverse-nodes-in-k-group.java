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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||head.next==null)return head;

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy;
        int size=len(head);

        while(size>=k){
            ListNode start=pre.next;
            pre.next=reverse(start,k);
            pre=start;
            size-=k;
        }
        return dummy.next;
    }

    public int len(ListNode head){
        ListNode tem=head;
        int c=0;
        while(tem!=null){
            c++;
            tem=tem.next;
        }
        return c;
    }

    public ListNode reverse(ListNode head,int k){
        ListNode curr=head,pre=null;
        while(k-->0&&curr!=null){
            ListNode tem=curr.next;
            curr.next=pre;
            pre=curr;
            curr=tem;
        }
        head.next=curr;
        return pre;
        
    }
}