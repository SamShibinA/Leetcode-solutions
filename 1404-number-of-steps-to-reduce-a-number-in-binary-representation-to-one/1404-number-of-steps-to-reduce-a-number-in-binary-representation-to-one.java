class Solution {
    public int numSteps(String s) {
        int answer=0;
        StringBuilder sb=new StringBuilder(s);

        while(!(sb.length()==1 && sb.charAt(0)=='1')){
            int last=sb.length()-1;

            if(sb.charAt(last)=='0'){
                sb.deleteCharAt(last);
            }
            else{
                int i=last;

                while(i>=0 && sb.charAt(i)=='1'){
                    sb.setCharAt(i,'0');
                    i--;
                }

                if(i<0){
                   sb.insert(0,'1');
                }
                else{
                    sb.setCharAt(i,'1');
                }
            }

            answer++;
        }
    return answer;
    }
    
}

