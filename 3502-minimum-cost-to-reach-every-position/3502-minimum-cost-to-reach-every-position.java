class Solution {
    public int[] minCosts(int[] cost) {
        int idx=0;
        for(int i=1;i<cost.length;i++){
            if(cost[i]>cost[idx]){
                cost[i]=cost[idx];
            }
            else{
                idx=i;
            }
        }
        return cost;
    }
}