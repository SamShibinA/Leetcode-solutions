class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp=new ArrayList<>();
        combination(n,k,0,temp);
        return ans;
    }

    public void combination(int n,int k,int index,List<Integer> temp){
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;}

        for(int i=index;i<n;i++){
            temp.add(i+1);
            combination(n,k,i+1,temp);
            temp.remove(temp.size()-1);
        }

    }
}