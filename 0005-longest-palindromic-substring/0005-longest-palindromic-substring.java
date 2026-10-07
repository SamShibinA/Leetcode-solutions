class Solution {
    public String longestPalindrome(String str) {
        int s=0,max=0,len=str.length();


        for(int i=0;i<len;i++){
            int l=i,r=i;

            while(l>=0 && r<len && str.charAt(l)==str.charAt(r)){
                if(max<(r-l+1)){
                    max=(r-l+1);
                    s=l;
                }
                r++;
                l--;
            }

            l=i;
            r=i+1;

            while(l>=0 && r<len && str.charAt(l)==str.charAt(r)){
                if(max<(r-l+1)){
                    max=(r-l+1);
                    s=l;
                }
                r++;
                l--;
            }

        }

        return str.substring(s,s+max);
    }
}