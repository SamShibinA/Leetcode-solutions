class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> fre=new HashMap<>();
        for(int n:nums){
            fre.put(n,fre.getOrDefault(n,0)+1);
            if(fre.get(n)>1)
            return n;
        }
        return 0;
    }
}