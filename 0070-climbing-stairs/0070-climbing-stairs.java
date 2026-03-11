class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return find(dp,n);
    }

    public int find(int[] dp,int n){
        if(n<=2)return n;

        if(dp[n]!=-1) return dp[n];

        dp[n]=find(dp,n-1)+find(dp,n-2);

        return dp[n];
    }
}