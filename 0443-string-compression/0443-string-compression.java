class Solution {
    public int compress(char[] chars) {
        int index=0;

        for(int i=0;i<chars.length;i++){
            char current=chars[i];
            int count=1;

            while(i+1 < chars.length && current==chars[i+1]){
                i++;
                count+=1;
            }

            chars[index++]=current;

            if(count>1){
                String ch=String.valueOf(count);

                for(char c:ch.toCharArray()){
                    chars[index++]=c;
                }
            }
        }
        return index;
    }

}