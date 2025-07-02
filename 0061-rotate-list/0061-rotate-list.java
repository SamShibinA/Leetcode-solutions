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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ||k==0||head.next==null)return head;
        k%=len(head);
        ListNode tem=head;
        ListNode pre=null;
        while(tem.next!=null){
            pre=tem;
            tem=tem.next;
        }
        tem.next=head;
        head=tem;
        pre.next=null;
        return rotateRight(head,k-1);
    }
    
    public int len(ListNode head){
        int  c=0;
        ListNode tem=head;
        while(tem!=null){
            c++;
            tem=tem.next;
        }
        return c;
    } 
}