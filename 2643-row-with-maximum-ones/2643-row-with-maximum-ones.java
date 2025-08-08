class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max_index=0,max_count=0;

        for(int i=0;i<mat.length;i++){
            int curr_count=0;
            for(int n:mat[i]){
                if(n==1)curr_count++;
            }
            if(curr_count>max_count){
                max_count=curr_count;
                max_index=i;
            }
        }

    return new int[]{max_index,max_count};
    }
}