class Solution {
    List<List<Integer>> ans=new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> tem=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        permutate(nums,tem,visited);
        return ans;
    }

    public void permutate(int[] num,List<Integer> tem,boolean[] visited){
        if(tem.size()>num.length) return;
        if(tem.size()==num.length){
            ans.add(new ArrayList<>(tem));
            return;
        }

        for(int i=0;i<num.length;i++){
            if(visited[i]) continue;
            visited[i]=true;
            tem.add(num[i]);
            permutate(num,tem,visited);
            tem.remove(tem.size()-1);
            visited[i]=false;

        }
    }
}