int trap(int* height, int heightSize) {
    int count = 0,left=0,right=heightSize-1,lm=0,rm=0;
    while(left<right){
        if(height[left]<height[right]){
            if(lm<=height[left]){
                lm=height[left];
            }
            else{
                count=count + lm - height[left];
            }
        left++;
        }
        else{
            if(rm<=height[right]){
                rm=height[right];
            }
            else{
                count=count + rm - height[right];
            }
        right--;
        }
   }
    return count;

}