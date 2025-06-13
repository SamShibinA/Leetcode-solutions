class Solution {
    public int subarraySum(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=Arrays.stream(Arrays.copyOfRange(nums,Math.max(0,i-nums[i]),i+1)).sum();
        }
        return s;
    }
}