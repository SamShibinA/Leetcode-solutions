class Solution {
    public int countPrimes(int n) {
       int c=0;
       for(int i=2;i<n;i++){
        if(isPrime(i))c++;
       }
       return c;
           
    }

    public static boolean isPrime(int n){
        if(n==2) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;

    }
}