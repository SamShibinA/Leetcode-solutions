class Solution {

    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        int pre=0,n=startTime.length,maxLeft=0,res=0;

        int[] gap=new int[n+1];

        for(int i=0;i<n;i++){
            gap[i]=startTime[i]-pre;
            pre=endTime[i];
        }

        gap[n]=eventTime-endTime[n-1];

        int[] maxRight=new int[n+1];

        for(int i=n-1;i>=0;i--){
            maxRight[i]=Math.max(maxRight[i+1],gap[i+1]);
        }

        for(int i=1;i<=n;i++){
            int dur=endTime[i-1]-startTime[i-1];

            if(maxLeft>=dur||maxRight[i]>=dur){
                res=Math.max(res,gap[i-1]+dur+gap[i]);
            }

            res=Math.max(res,gap[i-1]+gap[i]);
            maxLeft=Math.max(maxLeft,gap[i-1]);
        }

        return res;
    }
}