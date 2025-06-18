class Solution {
    public String removeOuterParentheses(String s) {
    int f=0;
    Stack<Character>st=new Stack<>();
    char[] ch=s.toCharArray();

    for(char c:ch){
        if(c=='('){
            if(f>0){
                st.push(c);
            }
            f++;          
        }
        else{
            f--;
            if(f>0){
                st.push(c);
            }
        }
    }
    
    StringBuilder sb=new StringBuilder();
    for(char c:st)sb.append(c);
    return sb.toString();

    
    
    }
}