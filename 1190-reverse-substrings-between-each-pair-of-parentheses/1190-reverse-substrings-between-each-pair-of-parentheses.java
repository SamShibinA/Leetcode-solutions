class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        Stack<Character> temp=new Stack<>();
        for(char c:s.toCharArray()){
            stack.push(c);
            if(stack.peek()==')'){
                while((!stack.isEmpty())&&stack.peek()!='('){
                    if(stack.peek()==')') stack.pop();
                    temp.push(stack.pop());
                }
                if((!stack.isEmpty())&&stack.peek()=='(') stack.pop();
                for(int i=0;i<temp.size();i++){
                    stack.push(temp.get(i));
                }
                temp.clear();
            }
        }

        StringBuilder sb=new StringBuilder();
        for(char c:stack) sb.append(c);
        return sb.toString();

    }
}