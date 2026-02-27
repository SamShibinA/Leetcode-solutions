class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();

        for(int n:nums){
            int fre=map.getOrDefault(n,0)+1;

            if(fre>result.size()){
                result.add(new ArrayList<>());
            }
            result.get(fre-1).add(n);
            map.put(n,fre);    
        }

        return result;
    }
}