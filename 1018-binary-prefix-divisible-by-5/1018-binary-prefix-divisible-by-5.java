class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> answer=new ArrayList<>();
        int t=0;
        for(int n:nums){
            t=(t<<1|n)%5;
            answer.add(t==0);
        }
        return answer;
    }
}

