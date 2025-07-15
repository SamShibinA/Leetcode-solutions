class Solution {
    public boolean isValid(String word) {
        int l=word.length();
        if(l<3)return false;
        boolean vowel=false,consonant=false;
        int count=0;
        for(char c:word.toCharArray()){
            int check="aeiouAEIOU".indexOf(c);
            if(check!=-1)vowel=true;
            else if(Character.isLetter(c)&&check==-1)consonant=true;
            else count++;
        }
        return l-count>=3?vowel&consonant:false;
    }
}