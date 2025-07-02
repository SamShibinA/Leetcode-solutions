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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head==null||head.next==null) return head;
        Set<Integer> set=new HashSet<>();

        for(int n:nums){
            set.add(n);
        }
        return delete(head,set);
    }

    public ListNode delete(ListNode head,Set<Integer> set){
        ListNode dummy=new ListNode(0);
        ListNode pre=dummy;
        ListNode curr=head;
        while(curr!=null){
            if(!set.contains(curr.val)){
                pre.next=curr;
                pre=pre.next;
            }
            curr=curr.next;
        }
            pre.next=null;
        return dummy.next;
    }
}