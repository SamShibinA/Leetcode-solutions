class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length;
        int idx=n-1;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==1){
                ans[idx--]=1;
            }
        }
        return ans;

        
    }
}