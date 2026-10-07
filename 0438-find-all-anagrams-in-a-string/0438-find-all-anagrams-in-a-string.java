class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pf=new int[26];

        int[] sf=new int[26];

        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<p.length();i++){
            pf[p.charAt(i)-'a']++;
        }

        int len=p.length();

        int l=0,r=0;

        while(r<s.length()){
            
            sf[s.charAt(r)-'a']++;

            int w=(r-l)+1;


            if(w>len){
                sf[s.charAt(l)-'a']--;
                l++;
            }

            if(isana(sf,pf)){
                ans.add(l);
            }

            r++;
        }

        return ans;
    }


    public static boolean isana(int[] sf,int[] pf){
        for(int i=0;i<26;i++){
            if(sf[i]!=pf[i])return false;
        }

        return true;
    }
}