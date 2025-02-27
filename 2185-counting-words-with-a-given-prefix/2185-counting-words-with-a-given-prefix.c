int prefixCount(char** words, int wordsSize, char* pref) {
    int result=0;
    for(int i=0;i<wordsSize;i++){
        if(strlen(pref)>strlen(words[i]))
        continue;
        int l=0;
        for(int j=0;j<strlen(pref);j++) {

            if(pref[j]==words[i][j]){
                l++;
            }
            else{
                l=0;
            }
             
        }
        if(l==strlen(pref)){
            result+=1;
        }
    }
    return result;
}