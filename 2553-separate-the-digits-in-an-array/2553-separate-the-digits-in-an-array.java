class Solution {
    List<Integer> number=new ArrayList<>();
    public int[] separateDigits(int[] nums) {

        
        for(int i=nums.length-1;i>=0;i--){
            add(nums[i]);
        }
        int n=number.size(),idx=0;

        int[] answer=new int[n];
 
        for(int i=n-1;i>=0;i--){
            answer[idx++]=number.get(i);
        }

        return answer;
    }

    public void add(int n){
        while(n>0){
            number.add(n%10);
            n/=10;
        }
    }
}