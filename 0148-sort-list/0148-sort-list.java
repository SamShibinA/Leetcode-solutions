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
    public ListNode sortList(ListNode head) {
      if(head==null||head.next==null){
        return head;
      }  

      ListNode mid=getMid(head);
      ListNode right=mid.next;
      mid.next=null;

      ListNode leftsorted=sortList(head);
      ListNode rightsorted=sortList(right);

      return merge(leftsorted,rightsorted);

    }

    public ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

        }
        return slow;
    }

    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode();
        ListNode tail=dummy;

        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                tail.next=l1;
                l1=l1.next;
            }
            else{
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }

        tail.next=(l1!=null)?l1:l2;
        return dummy.next;
    }
}