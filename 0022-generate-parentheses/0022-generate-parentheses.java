class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> answer=new ArrayList<>();

        traverse(answer,"",0,0,n);

        return answer;
    }

    public void traverse(List<String> answer,String str,int left,int right,int n){
        if(str.length()==n*2){
            answer.add(str);
            return;
        }

        if(left<n) traverse(answer,str+"(",left+1,right,n);

        if(right<left) traverse(answer,str+")",left,right+1,n);
    }
}