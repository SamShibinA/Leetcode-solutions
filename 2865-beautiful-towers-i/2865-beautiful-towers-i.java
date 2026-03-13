class Solution {
    public long maximumSumOfHeights(int[] heights) {
        int n=heights.length;
        long bestSum=0;
        
        for(int k=0;k<n;k++){
            int[] temp=new int[n];
            temp[k]=heights[k];

            for(int i=k-1;i>=0;i--){
                temp[i]=Math.min(heights[i],temp[i+1]);
            }

            for(int i=k+1;i<n;i++){
                temp[i]=Math.min(heights[i],temp[i-1]);
            }

            long sum=0;
            for(int i=0;i<n;i++){
                sum+=temp[i];
            }

            if(sum>bestSum){
                bestSum=sum;
            }
        }

        return bestSum;
    }
}