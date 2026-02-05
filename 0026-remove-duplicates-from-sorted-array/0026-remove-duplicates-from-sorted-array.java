class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1)return 1;
        int index=0;
        nums[index]=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[index]!=nums[i]){
                index++;
                nums[index]=nums[i];
            }
        }
        if(nums[index]!=nums[nums.length-1]){
            index++;
            nums[index]=nums[nums.length-1];
        }

        return index+1;
    }
}