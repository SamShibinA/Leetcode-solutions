char* restoreString(char* s, int* indices, int indicesSize) {
    char* ans=(char*)malloc(sizeof(char)*(indicesSize+1));
    for(int i=0;i<indicesSize;i++){
        ans[indices[i]]=s[i];
    }
    ans[indicesSize]='\0';
    return ans;

}