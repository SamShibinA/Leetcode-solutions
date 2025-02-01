class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n=0;
        for(int i=0;i<num.length;i++){
            n*=10;
            n+=num[i];
        }
        n+=k;
        int div=1000000000;
        List<Integer> ans=new ArrayList();
        while(div!=1){
            if(div<=n*10){
                ans.add((n%div)/(div/10));
            }
            div/=10;
        }
        return ans;
    }
}