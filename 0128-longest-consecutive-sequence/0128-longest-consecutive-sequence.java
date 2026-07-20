class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();

        for(int n:nums){
            set.add(n);
        }

        int max=0;

        for(int n:set){
            if(!set.contains(n-1)){
                int curr=n;
                int len=1;

                while(set.contains(curr+1)){
                    curr++;
                    len++;
                }

                max=Math.max(len,max);
            }
        }

        return max;
    }
}