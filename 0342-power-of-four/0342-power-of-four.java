class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        int i=0;
        while(true){
            if(n==Math.pow(4,i)) break;
            else if(n<Math.pow(4,i)) return false;
            i++;
        }

        return true;
    }
}