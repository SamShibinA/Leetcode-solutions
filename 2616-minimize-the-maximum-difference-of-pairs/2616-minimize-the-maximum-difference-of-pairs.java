class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);

        int l=0,r=nums[nums.length-1]-nums[0];
        int ans=r;

        while(l<=r){
            int m=l+(r-l)/2;
            if(canform(nums,p,m)){
                ans=m;
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    
    public static boolean canform(int[] nums,int p,int m){
        int c=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]<=m){
                c++;
                i++;
            }
        }

        return c>=p;
    }

}