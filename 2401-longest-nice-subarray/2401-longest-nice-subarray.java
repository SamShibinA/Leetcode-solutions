class Solution {
    public int longestNiceSubarray(int[] nums) {
        int max=0,l=0;
        for(int r=0;r<nums.length;r++){
            if(isnice(nums,l,r)){
                max=max>r-l+1?max:r-l+1;

            }
            else{
                l++;
            }
        }
        return max;
    }

    public boolean isnice(int[] nums,int s,int e){
        for(int i=s;i<=e;i++)for(int j=i+1;j<=e;j++)if((nums[i]&nums[j])!=0)return false;
        return true;
    }
}