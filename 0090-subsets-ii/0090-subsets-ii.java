class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(nums);
        traverse(answer,new ArrayList<>(),nums,0);
        return answer;
        
    }

    public void traverse(List<List<Integer>> answer,List<Integer> tem,int[] nums,int idx){
             answer.add(new ArrayList<>(tem));

            for(int i=idx;i<nums.length;i++){
                if(i>idx&&nums[i]==nums[i-1])continue;
                tem.add(nums[i]);
                traverse(answer,tem,nums,i+1);
                tem.remove(tem.size()-1);
            }
        
        }
}