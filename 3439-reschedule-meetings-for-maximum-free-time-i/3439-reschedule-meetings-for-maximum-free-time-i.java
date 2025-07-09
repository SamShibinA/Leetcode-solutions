class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int pre=0;
        ArrayList<Integer> space=new ArrayList<>();

        for(int i=0;i<startTime.length;i++){
            int diff=startTime[i]-pre;
            if(diff!=0){
                space.add(diff);
            }
            pre=endTime[i];
        }
        int diff=eventTime-endTime[endTime.length-1];
        if(diff!=0)space.add(diff);

        k+=1;

        if(k>=space.size())k=space.size();

        int sum=0,max=0;

        for(int i=0;i<k;i++){
            sum+=space.get(i);
        }
        max=sum;

        for(int i=0;i<space.size()-k;i++){
            sum=sum-space.get(i)+space.get(i+k);
            max=Math.max(max,sum);
        }

        return max;
    }
}