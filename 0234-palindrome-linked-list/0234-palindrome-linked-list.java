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
    public boolean isPalindrome(ListNode head) {
        int n=0;
        ListNode temp= new ListNode(head.val);
        ListNode second=temp;
        ListNode current=head.next;

        while(current!=null){
            temp.next=new ListNode(current.val);
            temp=temp.next;
            current=current.next;
        }

        ListNode pre=null;
        ListNode c=second;

        while(c!=null){
            ListNode next=c.next;
            c.next=pre;
            pre=c;
            c=next;
        }
        c=pre;
        while(head!=null){
            if(head.val!=c.val){
                return false;
            }
            head=head.next;
            c=c.next;
        }
        return true;
    }
}