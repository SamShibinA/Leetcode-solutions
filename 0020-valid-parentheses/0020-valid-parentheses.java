class Solution {
    public boolean isValid(String str) {
        Stack<Character> s=new Stack<>();
        char[] cha=str.toCharArray();

        for(char c:cha){
            if(c=='('||c=='['||c=='{') s.push(c);
            else{
                if(s.isEmpty()){
                    return false;
                }
                 if((c==')'&&s.peek()=='('||c==']'&&s.peek()=='['||c=='}'&&s.peek()=='{')){
                  s.pop();
                 }
                 else{
                    return false;
                 }
            }
        }
        return s.isEmpty();
    }
}