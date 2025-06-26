class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> tem=new ArrayList<>();
        combinate(k,n,tem,1,0);
        return ans;
    }

    public void combinate(int k,int n,List<Integer> tem,int idx,int sum){
        if(tem.size()>k||sum>n) return;
        if(tem.size()==k&&sum==n){
            ans.add(new ArrayList<>(tem));
            return;
        }

        for(int i=idx;i<=9;i++){
            tem.add(i);
            combinate(k,n,tem,i+1,sum+i);
            tem.remove(tem.size()-1);
        }
    }
}