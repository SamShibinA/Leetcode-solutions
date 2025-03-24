class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int e=0,o=1,n=nums.length;
        int[] temp=new int[n];
        for(int i:nums){
            if(i%2==0 && e<n){
                temp[e]=i;
                e+=2;
            }
            else if(o<n){
                temp[o]=i;
                o+=2;
            }
        }
        return temp;
    }
}