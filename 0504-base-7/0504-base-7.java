class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        boolean isnegative =num<0;
        StringBuilder result=new StringBuilder();
        num=Math.abs(num);
        while(num>0){
            result.append(num%7);
            num/=7;
        }
        if(isnegative) result.append("-");
        return result.reverse().toString();
    }
}
