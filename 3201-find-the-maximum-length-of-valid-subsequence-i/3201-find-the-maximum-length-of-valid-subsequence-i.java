class Solution {
    public int maximumLength(int[] nums) {
        int oc=0,ec=0,o_dp=0,e_dp=0;
        for(int n:nums){
            if(n%2==0){
                ec++;
                e_dp=Math.max(e_dp , o_dp+1);

            }
            else{
                 oc++;
                 o_dp=Math.max(e_dp+1,o_dp);
            }   
        }
        return Math.max(Math.max(oc,ec),Math.max(o_dp,e_dp));
    }
}