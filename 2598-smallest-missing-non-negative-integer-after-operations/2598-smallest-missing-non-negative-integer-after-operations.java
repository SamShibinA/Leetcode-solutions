class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] freq=new int[value+1];

        for(int n:nums){
            freq[((n % value) + value) % value]++;
        }

        int i=0;
        while(true){
            if(freq[i % value]==0){
                return i;
            }
            else{
                freq[i % value]--;
            }
            i++;
        }
    }
}