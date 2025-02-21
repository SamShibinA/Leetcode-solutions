int finalValueAfterOperations(char** operations, int operationsSize) {
    int c=0;
    for(int i=0;i<operationsSize;i++){
          if(operations[i][1]=='+')
          c++;
          else
          c--;
    }
    return c;
}