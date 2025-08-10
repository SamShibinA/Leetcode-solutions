class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int answer=0,current=0;
        for(int i=0;i<nums.length;i++){
            current+=nums[i];
            if(current==0){
                answer++;    
            }
        }
    return answer;
    }
}