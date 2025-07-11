class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            if(isPrime(Integer.bitCount(i)))count++;
        }
        return count;
    }
    public static boolean isPrime(int n){
        if(n<=1)return false;
        if(n==2) return true;
        for(int i=2;i<n;i++)if(n%i==0)return false;
        return true;
    }
}