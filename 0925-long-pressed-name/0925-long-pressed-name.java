class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0,j=0;
        int l1=name.length(),l2=typed.length();

        while(i<l1&&j<l2){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }
            else if(j>0&&typed.charAt(j)==typed.charAt(j-1)){
                j++;
            }
            else{
                return false;
            }
        }
        
        while(j<l2){
            if(typed.charAt(j)!=typed.charAt(j-1)){
                return false;
            }
            j++;
        }
        return i==l1;
    }
}

