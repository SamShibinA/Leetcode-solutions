class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        List<Integer> tem=new ArrayList<>();
        Arrays.sort(c);
        combinate(c,t,0,0,tem);
        return ans;
    }

    public void combinate(int[] c,int t,int idx,int sum,List<Integer> tem){
        if(sum>t) return;
        if(sum==t){
            ans.add(new ArrayList<>(tem));
            return;
        }

        for(int i=idx;i<c.length;i++){
            if(i>idx&&c[i]==c[i-1]) continue;
            tem.add(c[i]);
            combinate(c,t,i+1,sum+c[i],tem);
            tem.remove(tem.size()-1);
        }

    }
}