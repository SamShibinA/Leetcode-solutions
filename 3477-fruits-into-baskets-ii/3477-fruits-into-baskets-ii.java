class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        
        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < baskets.length; j++) {
                if (fruits[i] <= baskets[j]) {
                    baskets[j] = 0; // mark basket as used
                    fruits[i] = -1; // mark fruit as placed
                    break;
                }
            }
        }

        int answer = 0;

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] != -1) answer++; // count unplaced fruits
        }

        return answer;
    }
}


