import java.util.*;

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int l = queries.length;
        Arrays.sort(nums); // Sort to pick smallest elements first
        int[] ans = new int[l];
        int[] pre=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++)pre[i]=pre[i-1]+nums[i];

        for(int i=0;i<l;i++)ans[i]=higherBound(pre,queries[i]);

        return ans;
        
    }
    
    public int higherBound(int[] pre,int target){
        int low=0,high=pre.length;

        while(low<high){
            int mid=(low+high)/2;
            if(pre[mid]<=target)
            {
            low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
}
