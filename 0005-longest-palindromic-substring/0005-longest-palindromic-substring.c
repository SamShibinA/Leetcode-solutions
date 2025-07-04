char* longestPalindrome(char* s) {
    int n=strlen(s);
    int max=0,st=0;
    char* ans=(char*)malloc(sizeof(char)*(n+1));
    int l,r;
    for(int i=0;i<n;i++){
        l=i,r=i;
        while(l>=0&&r<n&&s[l]==s[r]){
            if((r-l+1)>max){
                max=r-l+1;
                st=l;
            }
            l--;
            r++;
        }
        l=i,r=i+1;
        while(l>=0&&r<n&&s[l]==s[r]){
            if((r-l+1)>max){
                max=r-l+1;
                st=l;
            }
            l--;
            r++;
        }
    }
    strncpy(ans,s+st,max);
    ans[max]='\0';
    return ans;
}