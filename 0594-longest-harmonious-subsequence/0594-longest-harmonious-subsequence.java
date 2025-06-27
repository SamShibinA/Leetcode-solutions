class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();

        for(int n:nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }

        int max=0;

        for(int n:nums){
            if(freq.containsKey(n+1))max=Math.max(max,freq.get(n)+freq.get(n+1));
        }
        return max;
    }
    
}