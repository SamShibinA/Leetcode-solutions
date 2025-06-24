class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=n;i++) ans.add(i);
        return winner(ans,k,0);
    }

    public static int winner(List<Integer> ans,int k,int idx){
        if(ans.size()==1) return ans.get(0);
        idx=(idx+k-1)%ans.size();
        ans.remove(idx);
            
        return winner(ans,k,idx);
    }
}