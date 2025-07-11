class Solution {
    public String removeKdigits(String num, int k) {
        
        int min=Integer.MAX_VALUE;
        if(k>=num.length())return"0";
        Stack<Character> stack=new Stack<>();

        for(char c:num.toCharArray()){

            while(!stack.isEmpty()&&k>0&&stack.peek()>c){
                stack.pop();
                k--;
            }

            stack.push(c);
        }

        while(k-->0)stack.pop();

        StringBuilder sb=new StringBuilder();

        for(char c:stack)sb.append(c);

        while(sb.length()>0&&sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        return sb.length()==0?"0":sb.toString();
    }
}