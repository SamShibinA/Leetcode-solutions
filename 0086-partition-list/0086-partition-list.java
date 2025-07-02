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
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null) return head;

        ListNode pre=new ListNode(-1);
        pre.next=head;
        ListNode dummy=pre;
        ListNode tem=pre.next;

        ListNode Large=null;

        while(tem!=null){
            if(tem.val>=x){
                Large=tem;
                break;
            }
            dummy=tem;
            tem=tem.next;
        }

        if(Large==null)return pre.next;
        
        ListNode curr=Large.next;
        ListNode prev=Large;

        while(curr!=null){
            if(curr.val<x){
                prev.next=curr.next;

                dummy.next=curr;
                curr.next=Large;
                dummy=curr;

                curr=prev.next;

            }
            else{

            prev=curr;
            curr=curr.next;
            }
        }

        return pre.next;

    }
}

