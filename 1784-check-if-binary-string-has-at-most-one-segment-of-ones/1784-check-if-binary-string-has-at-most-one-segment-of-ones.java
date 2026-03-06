class Solution {
    public boolean checkOnesSegment(String s) {
        int pre = -1;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(pre!=-1 && pre + 1 !=i){
                    return false;
                }
                pre=i;
            }
        }

        return true;
    }
}