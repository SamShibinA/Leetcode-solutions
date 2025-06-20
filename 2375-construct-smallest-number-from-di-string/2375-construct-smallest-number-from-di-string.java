class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> res=new Stack<>();
        Stack<Integer> tem=new Stack<>();
        int n=1;
        for(int i=0;i<=pattern.length();i++){
            tem.push(n++);

            if(i==pattern.length()||pattern.charAt(i)=='I'){
            while(!tem.isEmpty()){
            res.push(tem.pop());
            }
            }

        }
        StringBuilder sb=new StringBuilder();

        for(int i:res){
            sb.append((char)(i+'0'));
        }


        return sb.toString();

    }
}