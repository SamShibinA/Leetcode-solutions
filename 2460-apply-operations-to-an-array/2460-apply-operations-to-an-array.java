class Solution {
    public int[] applyOperations(int[] nums) {
        int i=0,j=1,n=nums.length;
        while(i<n-1&&j<n){
            if(nums[i]==nums[j]){
                nums[i]*=2;
                nums[j]=0;
            }
            i++;
            j++;
        }

        int idx=0;

        for(int k=0;k<n;k++){
            if(nums[k]!=0){
                nums[idx++]=nums[k];
            }
        }
        while(idx<n){
            nums[idx++]=0;
        }
        return nums;
    }
}