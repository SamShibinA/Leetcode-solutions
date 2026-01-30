class Solution {
    public String countAndSay(int n) {
        String answer="1";

        for(int i=2;i<=n;i++){
            StringBuilder temp=new StringBuilder();
            for(int j=0;j<answer.length();j++){
                char curr=answer.charAt(j);

                int count=1;
                while(j+1<answer.length() && curr==answer.charAt(j+1)){
                    count++;
                    j++;
                }
                temp.append(count);
                temp.append(curr);
            }
            answer=temp.toString();
        }
        return answer;
    }
}