class Solution {
    public int divide(int dividend, int divisor) {
    long q=(long)dividend/divisor;
    if(q>Integer.MAX_VALUE) return Integer.MAX_VALUE;
    return (int)q;
    }
}