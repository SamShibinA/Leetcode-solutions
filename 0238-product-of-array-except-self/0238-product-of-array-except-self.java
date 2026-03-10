class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int[] pre=new int[l];
        int[] suff=new int[l];
        int[] ans=new int[l];

        for(int i=0;i<l;i++){
            if(i!=0){
                pre[i]=pre[i-1]*nums[i-1];
            }
            else{
                pre[i]=1;
            }

            int ni=l-i-1;

            if(ni!=l-1){
                suff[ni]=suff[ni+1]*nums[ni+1];
            }
            else{
                suff[ni]=1;
            }
        }

        for(int i=0;i<l;i++){
            ans[i]=pre[i]*suff[i];
        }

        return ans;

    }
}