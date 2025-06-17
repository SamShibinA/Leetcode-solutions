class Solution {
    public boolean backspaceCompare(String s, String t) {
        return backspace(s).equals(backspace(t));
    }

    public static String backspace(String st){
        Stack<Character> s=new Stack<>();

        char[] ch=st.toCharArray();
        for(char c:ch){
            if(c!='#'){
                s.push(c);
            }
            else{
                if(!s.isEmpty())
                s.pop();
            }

        }
        StringBuilder sb=new StringBuilder();
        for(char c:s){
            sb.append(c);
        }
        return sb.toString();
    }
}