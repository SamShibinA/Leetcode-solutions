class Solution {
    public int alternatingSum(int[] nums) {
        int answer=0;

        boolean flag=true;

        for(int n:nums){
            if(flag){
                answer+=n;
            }
            else{
                answer-=n;
            }
            flag=!flag;

        }
        return answer;
    }
}