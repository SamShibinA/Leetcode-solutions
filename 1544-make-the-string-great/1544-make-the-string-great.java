class Solution {
    public String makeGood(String str) {
        Stack<Character> s=new Stack<>();
        char[] ch=str.toCharArray();

        for(int  i=0;i<ch.length;i++){
            if(!(s.isEmpty()) && Math.abs(s.peek()-ch[i])==32){
                s.pop();
            }
            else{
                s.push(ch[i]);
            }
        }

        StringBuilder sb=new StringBuilder();

        for(char c:s){
            sb.append(c);

        }
        return sb.toString();
    }
}