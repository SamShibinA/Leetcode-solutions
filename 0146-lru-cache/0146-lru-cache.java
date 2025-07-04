class LRUCache {
    Node head;
    Node tail;
    class Node{
        Node pre,next;
        int key,val;
        Node(int key,int val){
            this.key=key;
            this.val=val;
            this.pre=this.next=null;
        }
    }
    private Map<Integer,Node>map=new HashMap<>();

    private int capacity;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.pre=head;
    }
    
    public int get(int key) {
        Node tar=map.getOrDefault(key,null);
        if(tar==null) return -1;
        tar.next.pre=tar.pre;
        tar.pre.next=tar.next;

        tar.next=head.next;
        tar.next.pre=tar;
        
        tar.pre=head;
        head.next=tar;

        return tar.val;
    }
    
    public void put(int key, int val) {
        if(map.containsKey(key)){
            Node old=tail.pre;
            old.pre.next=old.next;
            old.next.pre=old.pre;
            map.remove(key);
        }

        if(map.size()==capacity){
            Node old=tail.pre;
            old.pre.next=old.next;
            old.next.pre=old.pre;
            map.remove(old.key);
        }
        
        Node newnode=new Node(key,val);
        newnode.next=head.next;
        newnode.next.pre=newnode;
        head.next=newnode;
        newnode.pre=head;
        map.put(newnode.key,newnode);

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */