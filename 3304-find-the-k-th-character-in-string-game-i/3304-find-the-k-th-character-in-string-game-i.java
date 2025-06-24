class Solution {
    public char kthCharacter(int k) {
        List<Character> ans=new ArrayList<>();
        ans.add('a');
        return kthchar(ans,k);
    }

    public static char kthchar(List<Character> ans,int k){
            if(ans.size()>=k) {
                return (char)ans.get(k-1);
            }
            int l=ans.size();
            for(int i=0;i<l;i++){
                char c=ans.get(i);

                if(c=='z'){
                ans.add('a');
                }
                else{
                    ans.add((char)(c+1));
                }
            }
            return kthchar(ans,k);
        }
}