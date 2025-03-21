class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
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

        for(int i=0;i<n;i++){
            if(nums[i]==target){
                ans.add(i);
            }
        }
        return ans;
    }
}