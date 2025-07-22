class Solution {
    public int partitionString(String s) {
        Set<Character> seen=new HashSet<>();
        int answer=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(seen.contains(c)){
                answer+=1;
                seen.clear();
            }
            
            seen.add(c);
            
        }
        return answer+1;
    }
}