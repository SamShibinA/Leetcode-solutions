class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        int idx=0;

        for(int i=1;i<intervals.length;i++){
            if(intervals[idx][1]>=intervals[i][0]){
                intervals[idx][1]=Math.max(intervals[idx][1],intervals[i][1]);
            }
            else{
                idx++;
                intervals[idx][0]=intervals[i][0];
                intervals[idx][1]=intervals[i][1];
            }
        }

        int[][] result=new int[idx+1][2];

        for(int i=0;i<=idx;i++){
            result[i]=intervals[i];
            // result[i][1]=intervals[i][1];
        }

        return result;
    }
}