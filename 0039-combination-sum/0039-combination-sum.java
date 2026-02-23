class Solution {
    List<List<Integer>> answer;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        answer=new ArrayList<>();

        traverse(new ArrayList<>(),candidates,target,0,0);

        return answer;
    }

    public void traverse(List<Integer> temp,int[] candidates,int target,int sum,int idx){
        if(sum > target) return;

        if(sum==target){
            answer.add(new ArrayList<>(temp));
        }

        for(int i=idx;i<candidates.length;i++){
            temp.add(candidates[i]);

            traverse(temp,candidates,target,sum + candidates[i],i);

            temp.remove(temp.size()-1);
        }
    }
}