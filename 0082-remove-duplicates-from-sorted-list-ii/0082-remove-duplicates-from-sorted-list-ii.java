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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode tem=pre;
        while(curr!=null){

            if(curr.next!=null&&curr.val==curr.next.val){
                while(curr.next!=null&&curr.val==curr.next.val){
                    curr=curr.next;
                }
                tem.next=curr.next;
            }
            else{
                tem=tem.next;
            }

            curr=curr.next;
        }

        return pre.next;
    }



}