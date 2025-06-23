class Solution {
    public int[] evenOddBit(int n) {
        int i=0,odd_c=0,even_c=0;
        while(n>0){
            if((n&1)==1){
                if(i%2==0)even_c++;
                else odd_c++;
            }
            i++;
            n>>=1;
        }
        return new int[]{even_c,odd_c};
    }
}