class Solution {
    public long countSubarrays(int[] nums, long k) {
        long sum=0;
        int l=0;
        long count=0;

        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            long product=sum*(r-l+1);

            while(product>=k){
                sum-=nums[l++];
                product=sum*(r-l+1);
            }

            count+=(r-l+1);
        }
        return count;
    }
}