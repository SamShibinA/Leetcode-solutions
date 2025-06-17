class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] values:matrix)for(int val:values)if(val==target) return true;      
        return false;
    }
}