class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0,len=nums.length;
        for(int i=0;i<len;i++){
            int left=i-k;
            int right=i+k;

            if(left>=0&&right<len){
                if(nums[i]>nums[left]&&nums[i]>nums[right])
                sum+=nums[i];
            }
            else if(left>=0&&right>=len){
                if(nums[i]>nums[left])
                sum+=nums[i];
            }
            else if(right<len&&left<0){
                if(nums[i]>nums[right])
                sum+=nums[i];
            }
            else{
                sum+=nums[i];
            }

        }

        return sum;
    }
}