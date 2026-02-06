class Solution {
    public int minOperations(String[] logs) {
        int index=0;

        for(String str:logs){
            if(str.equals("../")){
                if(index>0)
                index--;
            }
            else if(!str.equals("./")){
                index++;
            }

        }
        return index;
    }
}