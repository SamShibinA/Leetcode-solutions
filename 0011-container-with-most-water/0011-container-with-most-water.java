class Solution {
    public int maxArea(int[] height) {
        int max=0;

        int left=0,right=height.length-1;

        while(left<right){
            int min=height[left]<height[right]?height[left]:height[right];

            int new_max=min*(right-left);

            max=max<new_max?new_max:max;

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return max;
    }
}