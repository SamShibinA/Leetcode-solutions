class Solution {
    public int maxSum(int[] nums) {
        Set<Integer>seen=new HashSet<>();

        Arrays.sort(nums);

        int end=nums.length-1,sum=0,max=0;

        while(end>=0){
            if(!seen.contains(nums[end])){
                seen.add(nums[end]);
                sum+=nums[end];
                max=max>sum?max:sum;
            }
            end--;
        }

        return max;
    }
}