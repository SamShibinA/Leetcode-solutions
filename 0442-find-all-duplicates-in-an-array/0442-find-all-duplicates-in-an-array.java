class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer> ans=new ArrayList<>();
         Map<Integer,Integer> map=new HashMap<>();

         for(int n:nums){
            int fre=map.getOrDefault(n,0);
            if(fre>0){
                ans.add(n);
            }
            map.put(n,fre+1);
         }

         return ans;
    }
}