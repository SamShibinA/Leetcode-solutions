class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, new Comparator<int[]>() {
            public int compare(int[] row1, int[] row2) {
                return Integer.compare(row2[1], row1[1]);
            }
        });

        int ans = 0, idx = 0;

        while (truckSize > 0 && idx < boxTypes.length) {
            if (boxTypes[idx][0] > 0) {
                int boxesToTake = Math.min(boxTypes[idx][0], truckSize);
                ans += boxesToTake * boxTypes[idx][1];  
                truckSize -= boxesToTake; 
                boxTypes[idx][0] -= boxesToTake;  
            } else {
                idx++; 
            }
        }

        return ans; 
    }
}
