class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans=new int[nums.size()];

        int i=0;
        for(int n:nums){
            ans[i++]=find(n);
        }

        return ans;
    }

    public int find(int target){

        int i=0;

        while(i<1000){
            int temp=i | i+1;
            if(temp==target){
                return i;
            }


            i++;
        }

        return -1;
    }
}