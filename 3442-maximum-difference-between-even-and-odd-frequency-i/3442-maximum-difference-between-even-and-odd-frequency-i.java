class Solution {
    public int maxDifference(String s) {
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++; 
        }
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for(int i=0;i<26;i++){
            if(count[i]%2==1){
                max=Math.max(count[i],max);
            }
            else if(count[i]!=0){
                min=Math.min(count[i],min);
            }
        }
        return max-min;
    }
}