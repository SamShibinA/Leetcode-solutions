int countSeniors(char ** details, int detailsSize){
   int res=0;
   for(int i=0;i<detailsSize;i++){
    int age=(details[i][11]-'0')*10+(details[i][12]-'0');
    if(age>60)    
        res++;
    
   }
   return res;
}