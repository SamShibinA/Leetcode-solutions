class Solution {
    List<List<Integer>> answer;
    public List<List<Integer>> permute(int[] nums) {
        answer=new ArrayList<>();

        boolean[] visited=new boolean[nums.length];

        traverse(new ArrayList<>(),nums,visited);

        return answer;
    
    }

    public void traverse(List<Integer> temp,int[] nums,boolean[] visited){
        if(temp.size()==nums.length){
            answer.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(visited[i])continue;

            int n=nums[i];
            visited[i]=true;
            temp.add(n);
            traverse(temp,nums,visited);
            temp.remove(temp.size()-1);
            visited[i]=false;
        }
    }



}