class RecentCounter {
    
    Queue<Integer> queue;

    public RecentCounter() {
        queue=new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        int c=0;

        for(int n:queue){
            if(n>=t-3000&&n<=t){
                c++;
            }
        }

        return c;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */