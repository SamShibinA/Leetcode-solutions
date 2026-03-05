class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer> ans=new ArrayList<>();
         Set<Integer> map=new HashSet<>();

         for(int n:nums){
            if(map.contains(n)){
                ans.add(n);
            }
            map.add(n);
         }

         return ans;
    }
}