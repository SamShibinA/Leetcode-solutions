class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp=new ArrayList<>();
        combinationSum(candidates,target,0,temp,0);
        return ans;
    }

    public void combinationSum(int[] candidate,int target,int index,List<Integer> temp,int sum){
        if(sum>target) return;
        if(sum==target){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=index;i<candidate.length;i++){
            temp.add(candidate[i]);
            combinationSum(candidate,target,i,temp,sum+candidate[i]);
            temp.remove(temp.size()-1);
        }
    }
}