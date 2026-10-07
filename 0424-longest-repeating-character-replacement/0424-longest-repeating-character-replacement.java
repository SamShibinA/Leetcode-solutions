class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,max=0,maxfreq=0;

        int[] freq=new int[26];


        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);

            freq[c-'A']++;

            maxfreq=Math.max(maxfreq,freq[c-'A']);

            int rep=(r-l+1)-maxfreq;

            while(rep>k){
                freq[s.charAt(l)-'A']--;
                l++;
                rep--;
            }

            max=Math.max(max,r-l+1);
        }

        return max;

    }
}