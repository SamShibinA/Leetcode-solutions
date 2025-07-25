class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1;

        while(l<=r){
            int  m=numbers[l]+numbers[r];
            if(m==target) break;
            else if(m>target) r-=1;
            else l+=1;
        }

        return new int[]{l+1,r+1};
    }
}