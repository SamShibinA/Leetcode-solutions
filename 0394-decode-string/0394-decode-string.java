class Solution {
    public String decodeString(String s) {
        Stack<Integer> number=new Stack<>();
        Stack<StringBuilder> sbstack=new Stack<>();
        StringBuilder str=new StringBuilder();

        int num=0;

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
                continue;
            }
            else if(c=='['){
                number.push(num);
                num=0;
                sbstack.push(str);
                str=new StringBuilder();
            }
            else if(c==']') {
                int t=number.pop();
                StringBuilder curr=sbstack.pop();
                for(int i=0;i<t;i++)curr.append(str);
                str=curr;
            }
            else{
                str.append(c);
            }
        }
        return str.toString();
    }
}