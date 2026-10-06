class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length,idx=0,one_count=0;

        for(int i=0;i<n;i++){
            if(nums[i]==1)one_count++;
            if(nums[i]==0)nums[idx++]=0;
        }

        while(one_count-->0){
            nums[idx++]=1;
        }

        while(idx<n)nums[idx++]=2;
    }
}