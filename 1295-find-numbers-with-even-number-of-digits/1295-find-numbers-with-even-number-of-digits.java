class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i:nums){
            if(digit(i)){
                ans++;
            }
        }
        return ans;
    }
    public boolean digit(int num){
        int d=0;
        while(num>0){
            d+=1;
            num/=10;
        }
        return d%2==0;
    }
}