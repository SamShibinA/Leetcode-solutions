class Solution {
    public int binaryGap(int n) {
        return count(n);
    }

    public  static int count(int n){
        int i=0,max=0;
        boolean flag=false;
        while(n>0){
            if((n&1)==1){
                max=Math.max(max,i);
                i=0;
                flag=true;
            }
            n>>=1;
            if(flag)i++;
        }
        return max;
    }
}