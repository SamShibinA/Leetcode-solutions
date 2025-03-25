import java.util.Arrays;

class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums); 
        int c = 0;
        int n = nums.length;

        for( int i = 0; i < n; i++){
            if(nums[i]>0){
                int subvalue=nums[i];
                for(int j=i;j<n;j++){
                    if(nums[j]>0){
                        nums[j]-=subvalue;
                    }
                }
            c++;
            }
        }

        return c;
    }
}
