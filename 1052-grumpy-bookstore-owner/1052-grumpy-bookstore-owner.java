class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int answer=0;

        for(int i=0;i<customers.length;i++){
            if(grumpy[i] == 0){
                answer+=customers[i];
            }
        }

        int max=0;
        int sum=0;

        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                sum+=customers[i];
            }
        }
        max=Math.max(max,sum);

        for(int i=minutes;i<customers.length;i++){
            if(grumpy[i]==1){
                sum+=customers[i];
            }

            if(grumpy[i-minutes]==1){
                sum-=customers[i-minutes];
            }

            max=Math.max(max,sum);

        }
        return answer+max;
    }
}