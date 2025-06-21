class Solution {
    public String removeOccurrences(String s, String part) {
        int l=part.length();
        Stack <Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            boolean match=true;
            st.push(c);
            if(st.size()>=l){
                for(int i=0;i<l;i++){
                    if(st.get(st.size()-l+i)!=part.charAt(i)){

                    match=false;
                    break;
                    }

                }
                if(match){
                    for(int i=0;i<l;i++){
                        st.pop();
                    }
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st)sb.append(c);
        return sb.toString();
    }
}