class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        if(n<0) n=-n;

        while(n>0){
            if(n%3!=0 && n!=1) return false;
            n/=3;
        }
        return true;
    }
}