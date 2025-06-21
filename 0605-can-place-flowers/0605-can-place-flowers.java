class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=0;
        int l=flowerbed.length;

        for(int i=0;i<l;i++){
            boolean left=(i==0)||(flowerbed[i-1]==0);
            boolean right=(i==l-1)||(flowerbed[i+1]==0);

            if(flowerbed[i] == 0 &&left&&right){
                flowerbed[i]=1;
                c++;
                if(c>=n)return true;
            }
        }

        return c>=n;
    }
}