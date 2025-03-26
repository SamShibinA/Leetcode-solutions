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
    public ListNode mergeNodes(ListNode head) {
        ListNode ans=head.next;
        ListNode current=ans;
        ListNode pre=null;
        int sum=0;
        head=head.next;

        while(head!=null){
            if(head.val==0){
                current.val=sum;
                pre=current;
                current=current.next;
                sum=0;
            }
            sum+=head.val;
            head=head.next;
        }
        pre.next=null;
        return ans;
    }
}