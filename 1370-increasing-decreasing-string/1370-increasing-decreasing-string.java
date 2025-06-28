class Solution {
    public String sortString(String s) {
        StringBuilder sb=new StringBuilder(s);
        StringBuilder ans=new StringBuilder();
        Set<Character> set=new TreeSet<>();
        while(sb.length()>0){
            
            for(int i=0;i<sb.length();i++){
                set.add(sb.charAt(i));
            }

            for(char c:set){
                ans.append(c);
                sb.deleteCharAt(sb.indexOf(String.valueOf(c)));
            }
            set.clear();
            
            for(int i=0;i<sb.length();i++){
                set.add(sb.charAt(i));
            }

            List<Character> reverseList = new ArrayList<>(set);
            for (int i = reverseList.size() - 1; i >= 0; i--) {
                char c = reverseList.get(i);
                ans.append(c);
                sb.deleteCharAt(sb.indexOf(String.valueOf(c)));
            }
            
            set.clear();

        }

        return ans.toString();
        
    }
}