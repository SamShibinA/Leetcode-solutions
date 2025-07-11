class KthLargest {
    Queue<Integer> queue;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        queue=new PriorityQueue<>();
        for(int n:nums)queue.add(n);
    }
    
    public int add(int val) {
        queue.offer(val);
        while(queue.size()>k)queue.poll();
        return queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */