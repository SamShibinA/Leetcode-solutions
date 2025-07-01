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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(nextVal(head));
            head=head.next;
        }
        int ans[]=new int[list.size()];
        int i=0;
        for(int n:list){
            ans[i++]=n;
        }
        return ans;

    }
    public int nextVal(ListNode head){
        int val=0,iv=head.val;
        ListNode tem=head;
        while(tem!=null){
            if(tem.val>iv){
                val=tem.val;
                break;
            }
            tem=tem.next;
        }
        return val;
    }
}