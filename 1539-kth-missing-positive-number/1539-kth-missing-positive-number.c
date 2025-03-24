int findKthPositive(int* arr, int arrSize, int k) {
    int i=0,j=1;
    while(k>0){
        if(i<arrSize&&j==arr[i]){
            i++;
        }
        else{
            k--;
        }
        if(k==0){
            return j;
        }
        j++;
    }
    return -1;
}