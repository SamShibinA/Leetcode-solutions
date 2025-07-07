class MinStack {
    Node top;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    public MinStack() {
        top=new Node(-1);
    }
    
    public void push(int val) {
        Node newnode=new Node(val);
        newnode.next=top;
        top=newnode;

    }
    
    public void pop() {
        top=top.next;
    }
    
    public int top() {
        return top.val;
    }
    
    public int getMin() {
        Node curr=top;
        int min=curr.val;
        curr=curr.next;
        while(curr.next!=null){
            min=min>curr.val?curr.val:min;
            curr=curr.next;
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */