class Solution {
    public boolean backspaceCompare(String s, String t) {
        return removeBackspaces(s).equals(removeBackspaces(t));
    }

    public String removeBackspaces(String str){
        char[] result=str.toCharArray();

        int read=0,write=0;

        while(read<str.length()){
            if(result[read]!='#'){
                result[write++]=result[read];
            }
            else{
                if(write>0)write--;
            }
            read++;
        }

        return new String(result,0,write);
    }
}