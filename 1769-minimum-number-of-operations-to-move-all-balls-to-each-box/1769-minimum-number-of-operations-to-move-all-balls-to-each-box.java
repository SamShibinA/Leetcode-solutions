class Solution {
    public int[] minOperations(String boxes) {
        int l=boxes.length();
        int[] ans=new int[l];
        for(int i=0;i<l;i++){
            ans[i]=count(boxes,i);
        }
        return ans;

    }

    public static int count(String boxes,int idx){
        int s=0;
        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i)=='1'){
                s+=Math.abs(idx-i);
            }
        }
            return s;}
    
}