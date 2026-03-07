class Solution {
    public int minFlips(String s) {
        int n=s.length();
        String s2=s+s;
        int res=Integer.MAX_VALUE;
        int diff1=0,diff2=0;

        for(int i=0;i < n*2;i++){
            char pred1 = i % 2 == 0?'0':'1';
            char pred2 = i % 2 == 0?'1':'0';

            if(s2.charAt(i) != pred1) diff1++;
            if(s2.charAt(i) != pred2) diff2++;

            if(i>=n){
                char prev1= (i-n) % 2 == 0?'0':'1';
                char prev2= (i-n) % 2 == 0?'1':'0';

                if(s2.charAt(i-n) != prev1)diff1--;
                if(s2.charAt(i-n) != prev2)diff2--;
            }

            if(i>=n-1){
                res=Math.min(res,Math.min(diff1,diff2));
            }
        }

        return res;
    }
}