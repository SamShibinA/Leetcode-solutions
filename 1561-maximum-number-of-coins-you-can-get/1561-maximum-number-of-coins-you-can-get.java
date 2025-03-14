class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans=0,n=piles.length;
        int c=n/3,idx=n-2;
        while (c>0){
            ans+=piles[idx];
            idx-=2;
            c-=1;
        }
        return ans;

    }
}