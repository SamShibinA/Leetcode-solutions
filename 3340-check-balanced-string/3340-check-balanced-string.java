class Solution {
    public boolean isBalanced(String num) {
        StringBuilder s=new StringBuilder(num);
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0) sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
            else sum-=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return sum==0;
    }
}