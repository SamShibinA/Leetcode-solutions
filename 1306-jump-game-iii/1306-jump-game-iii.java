class Solution {
    public boolean canReach(int[] arr, int start) {
        int n=arr.length;
        Queue<Integer>q=new LinkedList<>();

        q.offer(start);


        while(!q.isEmpty()){
            int idx=q.poll();

            if(arr[idx]==0)return true;
            if(arr[idx]<0)continue;

            int new_idx=idx+arr[idx];

            
            if(new_idx<n)q.offer(new_idx);

            new_idx=idx-arr[idx];
            if(new_idx>=0)q.offer(new_idx);
            
            arr[idx]=-arr[idx];
        }

        return false;
    }
}