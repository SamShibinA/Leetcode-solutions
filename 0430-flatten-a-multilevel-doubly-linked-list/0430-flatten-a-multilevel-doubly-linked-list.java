/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null)return head;
        Node curr=head;

        while(curr!=null){
            if(curr.child!=null){
                Node next=curr.next;

                Node pro_head=flatten(curr.child);

                curr.next=pro_head;
                pro_head.prev=curr;
                curr.child=null;

                Node tail=pro_head;

                while(tail.next!=null){
                    tail=tail.next;
                }

                if(next!=null){
                    tail.next=next;
                    next.prev=tail;
                }
            }
            curr=curr.next;
        }    

        return head;
    }
}

