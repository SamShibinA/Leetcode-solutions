class Solution {
    public int maxProfit(int[] prices) {
        int max=0,min=10000;
        for(int n:prices){
            min=Math.min(min,n);
            max=Math.max(max,n-min);
        }
        return max;
    }
}