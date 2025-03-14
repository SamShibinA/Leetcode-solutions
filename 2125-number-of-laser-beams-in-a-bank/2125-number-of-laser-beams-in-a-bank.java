class Solution {
    public int numberOfBeams(String[] bank) {
        int n=bank.length,ans=0,pre=0;

        for(String row:bank){
            int d=0;
            for(char cell:row.toCharArray()){
                if(cell=='1'){
                    d+=1;
                }
            }
            if(d>0){
            ans+=pre*d;
            pre=d;
            }
        }
        return ans;
    }
}