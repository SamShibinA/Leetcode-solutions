class Solution {
    public int minTimeToType(String word) {
        int ans=0;
        ans+=word.length();
        char pre='a';
        for(int i=0;i<word.length();i++){
            char current=word.charAt(i);
            int d;
            if(current>pre){
            d = ((int)current-97) - ((int)pre-97) ;
            } 
            else{
                d = ((int)pre-97) - ((int)current-97) ;
            }
            ans+=d<25-d+1?d:25-d+1;
            pre=current;
        }
        return ans;
        
    }
}