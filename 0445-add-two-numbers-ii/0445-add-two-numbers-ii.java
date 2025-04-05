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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       l1=reverse(l1);
        l2=reverse(l2);
        int c=0;
        ListNode result=null;

        while(l1!=null||l2!=null||c!=0){
            int sum=c;

            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }

            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            c=sum/10;

            ListNode newNode=new ListNode(sum%10);
            newNode.next=result;
            result=newNode;
        }

        return result;
 
    }

    
    public ListNode reverse(ListNode current){
        ListNode pre=null;
        while(current!=null){
            ListNode next=current.next;
            current.next=pre;
            pre=current;
            current=next;
        }
        return pre;
    }

}