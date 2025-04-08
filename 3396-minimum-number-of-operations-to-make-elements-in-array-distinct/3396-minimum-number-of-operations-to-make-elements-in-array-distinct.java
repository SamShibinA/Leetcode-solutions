class Solution {
    public int minimumOperations(int[] nums) {
        int answer=0, n=nums.length, idx=0;
        while(!nodup(nums,idx,n)){
            idx+=3;
            answer++;
        }
        return answer;
    }

    public boolean nodup(int[] nums,int idx,int n){
        for(int i=idx;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    return false;
                }
            }
        }
        return true;
    }
}