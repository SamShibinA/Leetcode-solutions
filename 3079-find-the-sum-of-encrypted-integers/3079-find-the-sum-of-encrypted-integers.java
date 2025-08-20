class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int n:nums)sum+=encrypt(n);
        return sum;
    }

    public int encrypt(int num){
        int max=num%10;
        int temp=num;
        int count=0;
        
        while(temp>0){
            count++;
            max=max>temp%10?max:temp%10;
            temp/=10;
        }

        int ans=0;
        while(count-->0){
            ans=ans*10+max;
        }

        return ans;
    }

}