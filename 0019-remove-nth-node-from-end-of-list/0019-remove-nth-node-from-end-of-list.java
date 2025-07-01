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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=size(head)-n;
        if(len==0) return head.next;
        ListNode temp=head;
        int i=0;
        ListNode pre=null;
        while(temp!=null){
            if(len==i){
                pre.next=temp.next;
                break;
            }
            pre=temp;
            temp=temp.next;
            i++;
        }
        return head;
    }

    public int size(ListNode head){
        int count=0;
        ListNode tem=head;
        while(tem!=null){
            count++;
            tem=tem.next;
        }
        return count;
    }
}