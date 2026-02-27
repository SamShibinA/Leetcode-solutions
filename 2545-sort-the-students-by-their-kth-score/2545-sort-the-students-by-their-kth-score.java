class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        // Arrays.sort(score,(a,b)->b[k]-a[k]);
        // return score;

        int n=score.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(score[i][k]<score[j][k]){
                    int[] temp=score[i];
                    score[i]=score[j];
                    score[j]=temp;
                }
            }
        }

        return score; 
    }
}