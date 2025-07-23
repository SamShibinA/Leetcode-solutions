class Solution {
    public int maximumGain(String s, int x, int y) {
        if(x>y){
           return process(s,x,y,'a','b');
        }
           return process(s,y,x,'b','a');
    }


    public int process(String s,int first,int second,char firstval,char secondval){
        Stack<Character> letter=new Stack<>();
        int result=0;
        for(char c:s.toCharArray()){
            if(!letter.isEmpty()&&letter.peek()==firstval&&c==secondval){
                letter.pop();
                result+=first;
            }
            else{
                letter.push(c);
            }
        }

        StringBuilder sb=new StringBuilder();

        while(!letter.isEmpty()){
            sb.insert(0,letter.pop());
        }


        for(char c:sb.toString().toCharArray()){
            if(!letter.isEmpty()&&letter.peek()==secondval&&c==firstval){
                letter.pop();
                result+=second;
            }
            else{
                letter.push(c);
            }
        }
        return result;

    }
    
}