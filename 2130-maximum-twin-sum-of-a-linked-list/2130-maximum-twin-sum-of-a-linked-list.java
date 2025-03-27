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
    public int pairSum(ListNode head) {
        ListNode counter=head;
        int c=0;
        while(counter!=null){
            c++;
            counter=counter.next;
        }
        c/=2;
        ListNode move=head;

        for (int i = 0; i < c; i++) {
         move = move.next;
        }

        ListNode reverse=null;

        while(move!=null){
            ListNode next=move.next;
            move.next=reverse;
            reverse=move;
            move=next;
        }

        int max=0;
        while(head!=null && reverse!=null){
            max=max>head.val+reverse.val?max:head.val+reverse.val;
            head=head.next;
            reverse=reverse.next;
        }
        return max;

    }
}