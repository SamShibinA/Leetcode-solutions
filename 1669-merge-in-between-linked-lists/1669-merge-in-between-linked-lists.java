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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int c=0;
        ListNode head=list1;
        ListNode start=list1;
        ListNode end=list1;
        while(head!=null){
            if(c==a-1){
                start=head;
            }
            if(c==b+1){
                end=head;
            }
            head=head.next;
            c+=1;
        }
        start.next=list2;

        while(list2.next!=null){
            list2=list2.next;
        }
        list2.next=end;

        return list1;
    }
}