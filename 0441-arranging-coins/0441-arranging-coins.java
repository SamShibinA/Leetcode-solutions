class Solution {
    public int arrangeCoins(int n) {
        int c=0;
        for(int i=1;n>=i;i++,c+=1)  n=n-i;
        return c;
    }
}