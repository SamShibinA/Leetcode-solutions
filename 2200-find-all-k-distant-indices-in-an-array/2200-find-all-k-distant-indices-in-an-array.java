class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int len=nums.length;
        List<Integer> answer=new ArrayList<>();

        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                int diff=Math.abs(i-j);
                if(diff<=k&&nums[j]==key){
                    answer.add(i);
                    break;
                }
            }
        }

        return answer;
    }
}