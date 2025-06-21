class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        
        int[] pre=new int[l];
        int[] suf=new int[l];
        int[] ans=new int[l];
        for(int i=0;i<l;i++){
            if(i!=0){
            pre[i]=pre[i-1]*nums[i-1];
            }
            else{
                pre[i]=1;
            }
        }

        for(int i=l-1;i>=0;i--){
            if(i!=l-1){
            suf[i]=suf[i+1]*nums[i+1];
            }
            else{
            suf[i]=1;
            }
        }


        for(int i=0;i<l;i++ ){
            ans[i]=pre[i]*suf[i];
        }
        return ans;

    }

}