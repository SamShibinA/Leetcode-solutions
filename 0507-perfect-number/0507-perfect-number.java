class Solution {
    public boolean checkPerfectNumber(int num) {
        int t=num;
        for(int i=1;i<num/2+1;i++){
            if(num%i==0) t-=i;
            if (t<0) return false;
        }
        return t==0 ;
    }
}