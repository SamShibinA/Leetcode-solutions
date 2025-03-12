class Solution {
    public int minElement(int[] nums) {

        for(int i=0;i<nums.length;i++){
            nums[i]=sumofel(nums[i]);
        }

        int min=nums[0];

        for(int i=0;i<nums.length;i++){
            min=min>nums[i]?nums[i]:min;
        }
        return min;
    }

    public int sumofel(int num){
        int sum=0;

        while (num>=1){
            sum+=num%10;
            num/=10;
        }
        return sum;

    }
}