class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        generate(ans,0,0,n,"");
        return ans;
    }

    public void generate(List<String> ans,int left,int right,int n,String s){
        if(s.length()==n*2){
            ans.add(s);
            return;
        }

        if(left<n){
            generate(ans,left+1,right,n,s+"(");}

        if(right<left){
            generate(ans,left,right+1,n,s+")");}
    }
}