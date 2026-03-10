class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map=new HashMap<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

        int[] answer=new int[k];

        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(int n:map.keySet()){
            pq.offer(n);

            if(pq.size()>k){
                pq.poll();
            }
        }


        for(int i=0;i<k;i++){
            answer[i]=pq.poll();
        }
        return answer;
    }
}