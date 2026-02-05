class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1)return nums;
        int even_idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int temp=nums[i];
                nums[i]=nums[even_idx];
                nums[even_idx]=temp;
                even_idx++;
            }
        }
        return nums;
    }
}