bool isAcronym(char ** words, int wordsSize, char * s){
 if(wordsSize!=strlen(s)) return false;
 for(int i=0;i<wordsSize;i++){
    if(words[i][0]!=s[i]) return false;
 }
 return true;
}