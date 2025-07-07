class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        ArrayList<String> op=new ArrayList<>(Arrays.asList("+","-","/","*"));

        for(String s:tokens){
            if(!op.contains(s)){
                stack.push(Integer.parseInt(s));
            }
            else{
                int n2=stack.pop();
                int n1=stack.pop();
                if(s.equals("+"))n1+=n2;
                else if(s.equals("-"))n1-=n2;
                else if(s.equals("/"))n1/=n2;
                else n1*=n2;
                stack.push(n1);
            }
        }

        return stack.pop();
    }
}