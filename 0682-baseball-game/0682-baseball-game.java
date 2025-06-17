class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();

        for(String str:operations){
            if(str.equals("C")){
                s.pop();
            }
            else if(str.equals("D")){
                s.push(s.peek()*2);
            }
            else if(str.equals("+")){
                int top=s.peek();
                s.pop();
                int topsec=s.peek();
                s.push(top);
                s.push(top+topsec);
            }
            else {
                s.push(Integer.parseInt(str));
            }
        }

        int ans=0;
        for(int num:s) ans+=num;
        return ans;
    }
}