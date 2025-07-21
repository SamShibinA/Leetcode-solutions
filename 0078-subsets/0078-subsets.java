class Solution {
    List<List<Integer>> ans=new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
    traverse(new ArrayList<>(),nums,0);
    return ans;
        
    }

    public void traverse(List<Integer> tem,int[] nums,int idx){
        
        ans.add(new ArrayList<>(tem));

        for(int i=idx;i<nums.length;i++){
            tem.add(nums[i]);
            traverse(tem,nums,i+1);
            tem.remove(tem.size()-1);
        }
    }


}