class Solution {
    public int findJudge(int n, int[][] trust) {
        

        int[] judge=new int[n];

        for(int[] num:trust){
            judge[num[0]-1]--;
            judge[num[1]-1]++;
        }

        for(int i=0;i<n;i++){
            if(judge[i]==(n-1)) return i+1;
        }

        return -1;

    }
}