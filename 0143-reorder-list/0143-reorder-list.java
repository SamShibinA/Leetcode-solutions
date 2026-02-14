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
    List<ListNode> nodes=new ArrayList<>();

    public void reorderList(ListNode head) {
        ListNode dummy=new ListNode(0,null);
        ListNode temp=dummy;

        addnodes(head);

        while(!nodes.isEmpty()){
            temp.next=nodes.remove(0);
            temp=temp.next;

            if(!nodes.isEmpty()){
                temp.next=nodes.remove(nodes.size()-1);
                temp=temp.next;
            }
        }

        temp.next=null;



    }

    public void addnodes(ListNode head){
        if(head==null)return;
        nodes.add(head);
        addnodes(head.next);
    }
}