class Solution {
    public int earliestTime(int[][] tasks) {
        int min=Integer.MAX_VALUE;
        for(int[] task:tasks){
            int time=task[0]+task[1];
            if(time<min)min=time;
        }
        return min;
    }
}