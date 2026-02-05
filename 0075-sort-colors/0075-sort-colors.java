class Solution {
    public void sortColors(int[] nums) {
        int idx=0,one_count=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0)nums[idx++]=0;
            if(nums[i]==1)one_count++;
        }
        while(one_count>0){
            nums[idx++]=1;
            one_count--;
        }
        while(idx<n){
            nums[idx++]=2;
        }
    }
}