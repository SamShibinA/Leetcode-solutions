char* removeStars(char* s) {
    int read=0,write=0;
    while(s[read]){
        if(s[read]!='*'){
            s[write++]=s[read];
        }
        else{
            write--;
        }
        read++;
    }
    s[write]='\0';
    
    return s;
}