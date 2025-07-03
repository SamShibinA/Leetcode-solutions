class BrowserHistory {
     
    class Node{
        Node pre;
        Node next;
        String val;
        Node(String val){
            this.val=val;
            pre=null;
            next=null;
        }
    } 
     
    private Node current;
    public BrowserHistory(String homepage) {
        current=new Node(homepage);
    }
    
    public void visit(String url) {
        Node newnode=new Node(url);
        current.next=newnode;
        newnode.pre=current;
        current=newnode;
    }
    
    public String back(int steps) {
        while(steps>0&&current.pre!=null){
            steps--;
            current=current.pre;
        }
        return current.val;
    }
    
    public String forward(int steps) {
            while(steps>0&&current.next!=null){
            steps--;
            current=current.next;
            }
        return current.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
