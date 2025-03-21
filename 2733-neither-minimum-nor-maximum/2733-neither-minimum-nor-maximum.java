class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n-1;i++){
            int min=i;

            for(int j=i+1;j<n;j++){
                if(nums[min]>nums[j]) {
                    min=j;
                }
            }
            int temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }

        if(n<=2) return -1;
        return nums[1];

    }
}