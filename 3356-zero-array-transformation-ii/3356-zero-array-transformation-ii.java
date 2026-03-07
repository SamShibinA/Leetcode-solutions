class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int zc=0;

        for(int n:nums)if(n==0)zc++;
        if(zc==nums.length) return 0;

        for(int i=0;i<queries.length;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            int val=queries[i][2];

            for(int j=start;j<=end;j++){
                if(nums[j]>0){
                    nums[j]-=val;

                    if(nums[j]<=0){
                        zc++;
                    }

                }
            }
            if(zc==nums.length) return i+1;
        }
        return -1;
        
    }
}