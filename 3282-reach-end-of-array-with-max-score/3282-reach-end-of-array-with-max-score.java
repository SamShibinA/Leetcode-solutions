class Solution {
    public long findMaximumScore(List<Integer> nums) {
        long score=0;
        int max=nums.get(0);

        for(int i=0;i<nums.size()-1;i++){
            max=Math.max(max,nums.get(i));
            score+=max;
        }

        return score;
    }
}