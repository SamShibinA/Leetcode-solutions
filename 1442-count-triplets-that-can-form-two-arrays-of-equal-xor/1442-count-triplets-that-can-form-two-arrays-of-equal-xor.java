class Solution {
    public int countTriplets(int[] arr) {
        int res=0;

        for(int i=0;i<arr.length;i++){
            int xor=0;

            for(int k=i;k<arr.length;k++){
                xor^=arr[k];

                if(k>i && xor==0){
                    res+=(k-i);
                }
            }
        }

        return res;
    }
}