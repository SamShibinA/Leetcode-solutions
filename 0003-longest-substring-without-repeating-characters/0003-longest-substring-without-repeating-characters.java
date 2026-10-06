class Solution { 
    public int lengthOfLongestSubstring(String st) {
        int m=0,s=0;
        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<st.length();i++){
            char c=st.charAt(i);

            if(map.containsKey(c)){
                s=s>map.get(c)+1?s:map.get(c)+1;
                
            }
            
                map.put(c,i);

                m=m>i-s+1?m:i-s+1;
            
        }


        return m;
    }
}