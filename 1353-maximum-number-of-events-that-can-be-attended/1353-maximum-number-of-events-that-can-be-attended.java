class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a,b)->Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> minheap=new PriorityQueue<>();

        int day=0;
        int n=events.length,index=0;
        int res=0;

        while(!minheap.isEmpty()||index<n){

            if(minheap.isEmpty()){
                day=events[index][0];
            }

            while(index<n&&events[index][0]==day){
                minheap.offer(events[index][1]);
                index++;
            }

            while(!minheap.isEmpty()&&minheap.peek()<day)minheap.poll();

            if(!minheap.isEmpty()){
                minheap.poll();
                res++;
                day++;
            }
        }
    return res;
    }
}