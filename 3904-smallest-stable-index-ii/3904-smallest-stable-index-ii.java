class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;

        int[] cmax = new int[n];
        int[] cmin = new int[n];

        int max=nums[0];

        int min=nums[n-1];

        for(int i=0;i<n;i++){
            max=max>nums[i]?max:nums[i];

            cmax[i]=max;

            min=min<nums[n-i-1]?min:nums[n-i-1];

            cmin[n-i-1]=min;
        }

        // System.out.println(Arrays.toString(cmax));
        // System.out.println(Arrays.toString(cmin));

        for(int i=0;i<n;i++){
            if(cmax[i]-cmin[i]<=k){
                return i;
            }
        }


        return -1;

    }
}