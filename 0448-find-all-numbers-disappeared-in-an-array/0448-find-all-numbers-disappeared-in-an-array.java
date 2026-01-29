class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int size=nums.length;

        List<Integer> answer=new ArrayList<>();

        int[] frequency=new int[size +1];

        for(int n:nums){
            frequency[n]++;
        }

        for(int i=1;i<=size;i++){
            if(frequency[i]==0)answer.add(i);
        }

        return answer;
    }
}