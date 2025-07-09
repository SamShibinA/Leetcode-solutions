class Solution {
    public String resultingString(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(!stack.isEmpty()&&isAdjacent(stack.peek(),c)){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:stack)sb.append(c);

        return sb.length()==0?"":sb.toString();
    }

    public boolean isAdjacent(char a,char b){
        if(a=='z'&&b=='a'||a=='a'&&b=='z')return true;
        return Math.abs(a-b)==1;
    }
}