class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0,start=0;
        Map<Character,Integer>index=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(index.containsKey(c)){
                start=start>index.get(c)+1?start:index.get(c)+1;
            }
            index.put(c,i);
            max=max>i-start+1?max:i-start+1;

        }
        return max;
    }
}