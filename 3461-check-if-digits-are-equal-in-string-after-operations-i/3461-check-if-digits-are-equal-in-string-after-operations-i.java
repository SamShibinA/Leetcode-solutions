class Solution {
    public boolean hasSameDigits(String s) {
        return isPalin(s);
    }

    public boolean isPalin(String s){
        if(s.length()==2) return s.charAt(0)==s.charAt(1);
        return isPalin(adder(s,0));
    }

    public String adder(String str,int index){
        if(index==str.length()-1) return "";
        int a = Character.getNumericValue(str.charAt(index));
        int b = Character.getNumericValue(str.charAt(index + 1));
        int sum = (a + b) % 10;
        return sum+adder(str,index+1);
    }
}