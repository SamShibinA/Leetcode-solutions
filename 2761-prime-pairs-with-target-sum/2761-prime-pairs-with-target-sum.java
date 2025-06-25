class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans=new ArrayList<>();

        boolean[] ch=new boolean[n+1];
        Arrays.fill(ch,true);
        ch[0]=false;
        ch[1]=false;
        for(int i=2;i*i<=n;i++){
            if(ch[i]){
                for(int j=i*i;j<=n;j+=i){
                    ch[j]=false;
                }
            }
        }

        for(int i=2;i<=n/2;i++){
           if(ch[i]&&ch[n-i]){
            List<Integer> pair=new ArrayList<>();
            pair.add(i);
            pair.add(n-i);
            ans.add(pair);
           }
        }
        return ans;
    }
}