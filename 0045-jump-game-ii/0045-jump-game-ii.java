class Solution {

    class Pair{
        int step;
        int idx;
        Pair(int i,int s){
            idx=i;
            step=s;
        }
    }

    public int jump(int[] nums) {

        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(0,0));

        int n=nums.length-1;

        while(!q.isEmpty()){
            Pair curr=q.poll();

            if(curr.idx==n)return curr.step;

            if(nums[curr.idx]<0)continue;

            for(int i=1;i<=nums[curr.idx];i++){
                int nidx=curr.idx+i;

                if(nidx<=n)q.offer(new Pair(nidx,curr.step+1));
            } 

            nums[curr.idx]=-nums[curr.idx];
        }

        return -1;
    }
}