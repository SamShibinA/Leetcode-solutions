class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int[] suff=new int[n];
        int[] pref=new int[n];

        for(int i=0;i<n;i++){
            if(i==0){
                pref[i]=1;
            }
            else{
                pref[i]=pref[i-1]*nums[i-1];
            }


            int si=n-i-1;

            if(si==n-1){
                suff[si]=1;
            }
            else{
                suff[si]=suff[si+1]*nums[si+1];
            }
        }

        for(int i=0;i<n;i++){
            ans[i]=pref[i]*suff[i];
        }

        return ans;
    }
}