class Solution {
    public int maxDiff(int num) {
        String s=String.valueOf(num);
        return max(s)-min(s);
    }

    public static int max(String s){
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!='9'){
                return Integer.parseInt(s.replace(c,'9'));
            }
        }
        return Integer.parseInt(s);
        
    }

    public static int min(String s){
        if(s.charAt(0)!='1') return Integer.parseInt(s.replace(s.charAt(0),'1'));

        for(int i=1;i<s.length();i++){
            char c=s.charAt(i);
            if(c!='0'&&c!='1'){
                return Integer.parseInt(s.replace(c,'0'));
            }
        }

        return Integer.parseInt(s);
    }
}





