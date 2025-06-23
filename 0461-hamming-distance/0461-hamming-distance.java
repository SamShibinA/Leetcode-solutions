class Solution {
    public int hammingDistance(int x, int y) {
        return countBits(x^y);
    }

    public static int countBits(int n){
        int c=0;
        while(n>0){
            if((n&1)==1)c++;
            n>>=1;
        }
        return c;
    }
}