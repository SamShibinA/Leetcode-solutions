class Solution {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder();

        int index=0;

        for(String str:s.split("")){
            if(!str.equals("*")){
                sb.append(str);
                index++;
            }
            else{
                sb.deleteCharAt(--index);
            }
        }

        return sb.toString();
    }
}