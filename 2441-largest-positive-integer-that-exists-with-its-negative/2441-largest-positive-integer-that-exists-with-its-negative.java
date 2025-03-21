class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums) ;
        for(int i:nums){
            for(int j:nums){
                if( i==-j){
                    return j;
                }
            }
        }
        return -1;

    }
}